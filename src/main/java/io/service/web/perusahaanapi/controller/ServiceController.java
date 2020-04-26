package io.service.web.perusahaanapi.controller;


import io.service.web.perusahaanapi.dto.input.NormalInputClass;
import io.service.web.perusahaanapi.dto.input.NormallAllowance;
import io.service.web.perusahaanapi.dto.result.ResultDto;
import io.service.web.perusahaanapi.service.IHitung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payrollinfo")
public class ServiceController {

    @Autowired
    @Qualifier("CEO")
    private IHitung<NormalInputClass,Integer> ceo;

    @Autowired
    @Qualifier("Manager")
    private IHitung<NormalInputClass,Integer> manager;

    @Autowired
    @Qualifier("Senior")
    private IHitung<NormalInputClass,Integer> senior;

    @Autowired
    @Qualifier("Default")
    private IHitung<NormalInputClass,Integer> emp;

    @PostMapping("/ceo")
    public ResponseEntity<ResultDto> getCeo(@RequestBody NormalInputClass input){
        String basicsalary = "$"+ceo.hitungGaji();
        String tunjFamily = "$"+ceo.hitungTunjanganFam(input);
        String tunjLembur = "$"+ceo.hitungLembur(input);

        NormallAllowance allowance = new NormallAllowance(tunjFamily,tunjLembur);

        ResultDto resultDto = new ResultDto(input,allowance,basicsalary);

        return ResponseEntity.ok().body(resultDto);
    }

    @PostMapping("/manager")
    public ResponseEntity<ResultDto> getManager(@RequestBody NormalInputClass input){
        String basicsalary = "$"+manager.hitungGaji();
        String tunjFamily = "$"+manager.hitungTunjanganFam(input);
        String tunjLembur = "$"+manager.hitungLembur(input);

        NormallAllowance allowance = new NormallAllowance(tunjFamily,tunjLembur);

        ResultDto resultDto = new ResultDto(input,allowance,basicsalary);

        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/senioremp/{family}/{overtime}")
    public ResponseEntity<ResultDto> getSeniorEmp(@PathVariable("family") Integer family, @PathVariable("overtime") Integer overtime){

        NormalInputClass input = new NormalInputClass();
        input.setFamily(family);
        input.setOvertime(overtime);
        String basicsalary = "$"+senior.hitungGaji();
        String tunjFamily = "$"+senior.hitungTunjanganFam(input);
        String tunjLembur = "$"+senior.hitungLembur(input);

        NormallAllowance allowance = new NormallAllowance(tunjFamily,tunjLembur);

        ResultDto resultDto = new ResultDto(input,allowance,basicsalary);

        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/defaultemp/{family}/{overtime}")
    public ResponseEntity<ResultDto> getDefaultEmp(@PathVariable("family") Integer family, @PathVariable("overtime") Integer overtime){

        NormalInputClass input = new NormalInputClass();
        input.setFamily(family);
        input.setOvertime(overtime);
        String basicsalary = "$"+emp.hitungGaji();
        String tunjFamily = "$"+emp.hitungTunjanganFam(input);
        String tunjLembur = "$"+emp.hitungLembur(input);

        NormallAllowance allowance = new NormallAllowance(tunjFamily,tunjLembur);

        ResultDto resultDto = new ResultDto(input,allowance,basicsalary);

        return ResponseEntity.ok().body(resultDto);
    }
}
