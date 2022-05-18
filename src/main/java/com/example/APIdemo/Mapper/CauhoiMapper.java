package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Cauhoi;
import com.example.APIdemo.DTO.CauhoiDTO;


public class CauhoiMapper {
    public static CauhoiDTO toCauhoiDTO(Cauhoi cauhoi){
        CauhoiDTO tmp = new CauhoiDTO();
        tmp.setMacauhoi(cauhoi.getMacauhoi());
        tmp.setNoidung(cauhoi.getNoidung());
        tmp.setA(cauhoi.getA());
        tmp.setB(cauhoi.getB());
        tmp.setC(cauhoi.getC());
        tmp.setD(cauhoi.getD());
        tmp.setDapan(cauhoi.getDapan());
        tmp.setHinhanh(cauhoi.getHinhAnh());
        return tmp;
    }
}
