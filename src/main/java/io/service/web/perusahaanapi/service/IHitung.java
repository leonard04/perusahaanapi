package io.service.web.perusahaanapi.service;

public interface IHitung <I,O>{
    O hitungGaji();
    O hitungTunjanganFam(I input);
    O hitungLembur(I input);
}
