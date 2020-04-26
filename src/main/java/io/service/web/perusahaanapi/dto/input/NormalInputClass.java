package io.service.web.perusahaanapi.dto.input;

public class NormalInputClass {
    private int family;
    private int overtime;

    public NormalInputClass() {
    }

    public NormalInputClass(int family, int overtime) {
        this.family = family;
        this.overtime = overtime;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
}
