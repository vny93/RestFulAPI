package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Meo;
import com.example.APIdemo.DTO.MeoDTO;
import com.example.APIdemo.Mapper.MeoMapper;
import com.example.APIdemo.Repositories.MeoRepository;
import com.example.APIdemo.Services.MeoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
public class MeoServiceImpl implements MeoService {
    @Autowired
    private MeoRepository meoRepository;

    @Override
    public MeoDTO getMeoByLoaiMeo(Integer maLoaiMeo){
        List<Meo> Meos = meoRepository.findAll();
        for(Meo meo : Meos){
            if(meo.getMaLoaiMeo().getMaLoaiMeo() == maLoaiMeo){
                return MeoMapper.toLoaiMeoDTO(meo);
            }
        }
        return null;
    }
}
