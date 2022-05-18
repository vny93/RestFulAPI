package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Loaide;
import com.example.APIdemo.DTO.LoaideDTO;
import com.example.APIdemo.Mapper.LoaideMapper;
import com.example.APIdemo.Repositories.LoaideRepository;
import com.example.APIdemo.Services.LoaideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoaideServiceImpl implements LoaideService {
    @Autowired
    private LoaideRepository loaideRepository;

    @Override
    public List<LoaideDTO> getListLoaide(){
        List<LoaideDTO> result = new ArrayList<LoaideDTO>();
        List<Loaide> loaides = loaideRepository.findAll();
        for(Loaide loaide : loaides){
            result.add(LoaideMapper.toLoaideDTO(loaide));
        }
        return result;
    }
}
