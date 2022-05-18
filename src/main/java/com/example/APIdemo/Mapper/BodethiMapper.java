package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Bodethi;
import com.example.APIdemo.BangLaiXe.Loaibang;
import com.example.APIdemo.DTO.BodethiDTO;
import com.example.APIdemo.DTO.LoaibangDTO;

public class BodethiMapper {
    public static BodethiDTO toBodethiDTO(Bodethi bodethi){
        BodethiDTO tmp = new BodethiDTO();
        tmp.setMabodethi(bodethi.getMabodethi());
        return tmp;
    }
}
