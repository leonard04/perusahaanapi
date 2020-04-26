package io.service.web.perusahaanapi.dto.result;

import io.service.web.perusahaanapi.dto.input.NormalInputClass;
import io.service.web.perusahaanapi.dto.input.NormallAllowance;

public class ResultDto {
    private NormalInputClass info;
    private NormallAllowance allowance;
    private String basicsalary;

    public ResultDto() {
    }

    public ResultDto(NormalInputClass info, NormallAllowance allowance, String basicsalary) {
        this.info = info;
        this.allowance = allowance;
        this.basicsalary = basicsalary;
    }

    public NormalInputClass getInfo() {
        return info;
    }

    public void setInfo(NormalInputClass info) {
        this.info = info;
    }

    public NormallAllowance getAllowance() {
        return allowance;
    }

    public void setAllowance(NormallAllowance allowance) {
        this.allowance = allowance;
    }

    public String getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(String basicsalary) {
        this.basicsalary = basicsalary;
    }
}
