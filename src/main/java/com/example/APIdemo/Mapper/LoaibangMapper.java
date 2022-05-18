package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Loaibang;
import com.example.APIdemo.BangLaiXe.User;
import com.example.APIdemo.DTO.LoaibangDTO;
import com.example.APIdemo.DTO.UserDTO;

public class LoaibangMapper {
    public static LoaibangDTO toLoaibangDTO(Loaibang loaibang){
        LoaibangDTO tmp = new LoaibangDTO();
        tmp.setMaloaibang(loaibang.getMaloaibang());
        tmp.setTenloaibang(loaibang.getTenloaibang());
        return tmp;
    }
}
