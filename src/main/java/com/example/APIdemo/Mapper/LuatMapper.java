package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.LuatGt;
import com.example.APIdemo.DTO.LuatDTO;

public class LuatMapper {
    public static LuatDTO toLuatDTO(LuatGt luatGt){
        LuatDTO tmp = new LuatDTO();
        tmp.setMaluat(luatGt.getMaluat());
        tmp.setNoidung(luatGt.getNoidung());
        tmp.setMucphat(luatGt.getMucphat());
        return tmp;
    }
}
