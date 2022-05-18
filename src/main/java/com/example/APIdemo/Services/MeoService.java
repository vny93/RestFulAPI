package com.example.APIdemo.Services;

import com.example.APIdemo.DTO.MeoDTO;
import org.springframework.stereotype.Service;

@Service
public interface MeoService {
    MeoDTO getMeoByLoaiMeo(Integer maLoaiMeo);
}
