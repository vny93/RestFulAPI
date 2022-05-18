package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.Bodethi;
import com.example.APIdemo.DTO.BodethiDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BodethiService {

    BodethiDTO getBoDe(Integer maLoaibang, Integer maLoaide);
}
