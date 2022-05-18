package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Loailithuyet;
import com.example.APIdemo.DTO.LoailithuyetDTO;

public class LoailithuyetMapper {
    public static LoailithuyetDTO toLoailithuyetDTO(Loailithuyet loailithuyet){
        LoailithuyetDTO tmp = new LoailithuyetDTO();
        tmp.setMaLoaiLiThuyet(loailithuyet.getMaLoaiLiThuyet());
        tmp.setTenloai(loailithuyet.getTenloai());
        return tmp;
    }
}
