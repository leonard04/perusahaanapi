package io.service.web.perusahaanapi.service;

import io.service.web.perusahaanapi.dto.input.NormalInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Manager")
public class ManagerServices implements IHitung<NormalInputClass,Integer>  {
    @Override
    public Integer hitungGaji() {
        return 3*4500;
    }

    @Override
    public Integer hitungTunjanganFam(NormalInputClass input) {
        int tunjangan = input.getFamily() * 30;
        return tunjangan;
    }

    @Override
    public Integer hitungLembur(NormalInputClass input) {
        int tunjangan = input.getOvertime() * 10;
        return tunjangan;
    }
}
