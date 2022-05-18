package com.example.APIdemo.Controller;

import com.example.APIdemo.DTO.LoaideDTO;
import com.example.APIdemo.DTO.TaikhoanDTO;
import com.example.APIdemo.Services.LoaideService;
import com.example.APIdemo.Services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loaide/")
public class LoaideController {
    @Autowired
    private LoaideService loaideService;

    @GetMapping("get")
    public List<LoaideDTO> getListloaide() {
        List<LoaideDTO> list = loaideService.getListLoaide();
        return list;
    }
}

