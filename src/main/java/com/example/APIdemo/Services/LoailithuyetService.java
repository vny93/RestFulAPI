package com.example.APIdemo.Services;

import com.example.APIdemo.DTO.LoailithuyetDTO;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface LoailithuyetService {

    List<LoailithuyetDTO> getListLoailt();

    LoailithuyetDTO getLoailtByID(Integer id);
}
