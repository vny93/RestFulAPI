package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Loaibang;
import com.example.APIdemo.DTO.LoaibangDTO;
import com.example.APIdemo.Mapper.LoaibangMapper;
import com.example.APIdemo.Repositories.LoaibangRepository;
import com.example.APIdemo.Services.LoaibangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoaibangServiceImpl implements LoaibangService {
    @Autowired
    private LoaibangRepository loaibangRepository;

    @Override
    public List<LoaibangDTO> getListLoaibang(){
        List<LoaibangDTO> result = new ArrayList<LoaibangDTO>();
        List<Loaibang> loaibangs = loaibangRepository.findAll();
        for(Loaibang loaibang : loaibangs){
            result.add(LoaibangMapper.toLoaibangDTO(loaibang));
        }
        return result;
    }

}
