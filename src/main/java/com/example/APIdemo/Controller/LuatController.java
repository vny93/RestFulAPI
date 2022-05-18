package com.example.APIdemo.Controller;

import com.example.APIdemo.DTO.LoaiLuatDTO;
import com.example.APIdemo.DTO.LuatDTO;
import com.example.APIdemo.Services.LoaiLuatGtService;
import com.example.APIdemo.Services.LuatGtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/luat/")
public class LuatController {
    @Autowired
    private LuatGtService luatGtService;

    @Autowired
    private LoaiLuatGtService loaiLuatGtService;

    @GetMapping("getLoailuat")
    public List<LoaiLuatDTO> getLoaiLuat() {
        List<LoaiLuatDTO> list = loaiLuatGtService.getListLoailuat();
        return list;
    }

    @GetMapping("getLuat")
    public List<LuatDTO> getMeo(@RequestParam(name="maloailuat") Integer maloailuat) {
        List<LuatDTO> result = luatGtService.getLuatByLoaiLuat(maloailuat);
        return result;
    }
}
