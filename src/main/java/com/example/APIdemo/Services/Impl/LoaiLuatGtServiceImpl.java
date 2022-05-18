package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.LoaiLuatGt;
import com.example.APIdemo.DTO.LoaiLuatDTO;
import com.example.APIdemo.Mapper.LoailuatMapper;
import com.example.APIdemo.Repositories.LoaiLuatGtRepository;
import com.example.APIdemo.Services.LoaiLuatGtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoaiLuatGtServiceImpl implements LoaiLuatGtService {
    @Autowired
    private LoaiLuatGtRepository loaiLuatGtRepository;

    @Override
    public List<LoaiLuatDTO> getListLoailuat(){
        List<LoaiLuatDTO> result = new ArrayList<>();
        List<LoaiLuatGt> loaiLuatGts = loaiLuatGtRepository.findAll();
        for(LoaiLuatGt loaiLuatGt : loaiLuatGts){
            result.add(LoailuatMapper.toLoailuatDTO(loaiLuatGt));
        }
        return result;
    }
}
