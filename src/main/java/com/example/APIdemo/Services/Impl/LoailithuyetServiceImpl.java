package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Loailithuyet;
import com.example.APIdemo.DTO.LoailithuyetDTO;
import com.example.APIdemo.Mapper.LoailithuyetMapper;
import com.example.APIdemo.Repositories.LoailithuyetRepository;
import com.example.APIdemo.Services.LoailithuyetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoailithuyetServiceImpl implements LoailithuyetService {
    @Autowired
    private LoailithuyetRepository loailithuyetRepository;

    @Override
    public List<LoailithuyetDTO> getListLoailt(){
        List<LoailithuyetDTO> result = new ArrayList<LoailithuyetDTO>();
        List<Loailithuyet> loailt = loailithuyetRepository.findAll();
        for(Loailithuyet loailithuyet : loailt){
            result.add(LoailithuyetMapper.toLoailithuyetDTO(loailithuyet));
        }
        return result;
    }

    @Override
    public LoailithuyetDTO getLoailtByID(Integer id){
        List<Loailithuyet> loailithuyets = loailithuyetRepository.findAll();
        for(Loailithuyet loailt : loailithuyets){
            if(loailt.getMaLoaiLiThuyet() == id){
                return LoailithuyetMapper.toLoailithuyetDTO(loailt);
            }
        }
        return null;
    }

}
