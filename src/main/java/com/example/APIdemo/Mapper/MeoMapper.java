package com.example.APIdemo.Mapper;


import com.example.APIdemo.BangLaiXe.Meo;
import com.example.APIdemo.DTO.MeoDTO;

public class MeoMapper {
    public static MeoDTO toLoaiMeoDTO(Meo meo){
        MeoDTO tmp = new MeoDTO();
        tmp.setMaMeo(meo.getMaMeo());
        tmp.setNoidung(meo.getNoidung());
        return tmp;
    }
}
