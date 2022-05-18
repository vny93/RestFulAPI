package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Bodethi;
import com.example.APIdemo.BangLaiXe.User;
import com.example.APIdemo.DTO.BodethiDTO;
import com.example.APIdemo.Mapper.BodethiMapper;
import com.example.APIdemo.Mapper.UserMapper;
import com.example.APIdemo.Repositories.BodethiRepository;
import com.example.APIdemo.Services.BodethiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BodethiServiceImpl implements BodethiService {
@Autowired
   private BodethiRepository bodethiRepository;

    @Override
    public BodethiDTO getBoDe(Integer maLoaibang, Integer maLoaide) {
        List<Bodethi> bodethis = bodethiRepository.findAll();
        for(Bodethi bodethi : bodethis){
            if((bodethi.getMaloaibang().getMaloaibang())==maLoaibang && (bodethi.getMaloaide().getMaloaide())==maLoaide){
                return BodethiMapper.toBodethiDTO(bodethi);
            }
        }
        return null;
    }
}
