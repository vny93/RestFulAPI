package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Loaide;
import com.example.APIdemo.DTO.LoaideDTO;

public class LoaideMapper {
    public static LoaideDTO toLoaideDTO(Loaide loaide){
        LoaideDTO tmp = new LoaideDTO();
        tmp.setMaloaide(loaide.getMaloaide());
        tmp.setTenloaide(loaide.getTenloaide());
        tmp.setSocau(loaide.getSocau());
        tmp.setThoigian(loaide.getThoigian());
        return tmp;
    }
}
