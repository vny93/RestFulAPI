package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.LuatGt;
import com.example.APIdemo.DTO.LuatDTO;
import com.example.APIdemo.Mapper.LuatMapper;
import com.example.APIdemo.Repositories.LuatGtRepository;
import com.example.APIdemo.Services.LuatGtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LuatGtServiceImpl implements LuatGtService {
    @Autowired
    private LuatGtRepository luatGtRepository;

    @Override
    public List<LuatDTO> getLuatByLoaiLuat(Integer maLoailuat){
        List<LuatGt> luatGts = luatGtRepository.findAll();
        List<LuatDTO> list = new ArrayList<>();
        for(LuatGt luatGt : luatGts){
            if(luatGt.getMaLoaiLuatGt().getMaLoaiLuatGt() == maLoailuat){
                list.add(LuatMapper.toLuatDTO(luatGt));
            }
        }
        return list;
    }
}
