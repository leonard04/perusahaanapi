package io.service.web.perusahaanapi.dto.input;

public class NormallAllowance {
    private String family;
    private String overtime;

    public NormallAllowance() {
    }

    public NormallAllowance(String family, String overtime) {
        this.family = family;
        this.overtime = overtime;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime;
    }
}
