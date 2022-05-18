package com.example.APIdemo.Services.Impl;


import com.example.APIdemo.BangLaiXe.LoaiMeo;
import com.example.APIdemo.DTO.LoaiMeoDTO;
import com.example.APIdemo.Mapper.LoaimeoMapper;
import com.example.APIdemo.Repositories.LoaiMeoRepository;
import com.example.APIdemo.Services.LoaiMeoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Component
public class LoaiMeoServiceImpl implements LoaiMeoService {
    @Autowired
    private LoaiMeoRepository loaiMeoRepository;

    @Override
    public List<LoaiMeoDTO> getListLoaimeo(){
        List<LoaiMeoDTO> result = new ArrayList<>();
        List<LoaiMeo> loaiMeos = loaiMeoRepository.findAll();
        for(LoaiMeo loaiMeo : loaiMeos){
            result.add(LoaimeoMapper.toLoaiMeoDTO(loaiMeo));
        }
        return result;
    }
}
