package com.example.APIdemo.Mapper;


import com.example.APIdemo.BangLaiXe.LoaiMeo;
import com.example.APIdemo.DTO.LoaiMeoDTO;


public class LoaimeoMapper {
    public static LoaiMeoDTO toLoaiMeoDTO(LoaiMeo loaiMeo){
        LoaiMeoDTO tmp = new LoaiMeoDTO();
        tmp.setMaLoaiMeo(loaiMeo.getMaLoaiMeo());
        tmp.setTenLoaiMeo(loaiMeo.getTenLoaiMeo());
        return tmp;
    }
}
