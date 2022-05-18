package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.LuatGt;
import com.example.APIdemo.DTO.LuatDTO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public interface LuatGtService {

    List<LuatDTO> getLuatByLoaiLuat(Integer maLoailuat);
}
