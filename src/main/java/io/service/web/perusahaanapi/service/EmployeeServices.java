package io.service.web.perusahaanapi.service;

import io.service.web.perusahaanapi.dto.input.NormalInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Default")
public class EmployeeServices implements IHitung<NormalInputClass,Integer> {
    @Override
    public Integer hitungGaji() {
        return 4500;
    }

    @Override
    public Integer hitungTunjanganFam(NormalInputClass input) {
        int tunjangan = input.getFamily() * 30;
        return tunjangan;
    }

    @Override
    public Integer hitungLembur(NormalInputClass input) {
        int tunjangan = input.getOvertime() * 4;
        return tunjangan;
    }
}
