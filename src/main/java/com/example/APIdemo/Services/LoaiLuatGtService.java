package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.LoaiLuatGt;
import com.example.APIdemo.DTO.LoaiLuatDTO;
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
public interface LoaiLuatGtService {

    List<LoaiLuatDTO> getListLoailuat();
}
