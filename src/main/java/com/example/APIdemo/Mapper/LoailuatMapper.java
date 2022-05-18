package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.LoaiLuatGt;
import com.example.APIdemo.DTO.LoaiLuatDTO;

public class LoailuatMapper {
    public static LoaiLuatDTO toLoailuatDTO(LoaiLuatGt loaiLuatGt){
        LoaiLuatDTO tmp = new LoaiLuatDTO();
        tmp.setMaLoaiLuatGt(loaiLuatGt.getMaLoaiLuatGt());
        tmp.setTenLoaiLuatGt(loaiLuatGt.getTenLoaiLuatGt());
        return tmp;
    }
}
