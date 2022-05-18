package com.example.APIdemo.Controller;

import com.example.APIdemo.DTO.LoaiMeoDTO;
import com.example.APIdemo.DTO.MeoDTO;
import com.example.APIdemo.Services.LoaiMeoService;
import com.example.APIdemo.Services.MeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meo/")
public class MeoController {

    @Autowired
    private MeoService meoService;

    @Autowired
    private LoaiMeoService loaiMeoService;

    @GetMapping("getLoaiMeo")
    public List<LoaiMeoDTO> getLoaiMeo() {
        List<LoaiMeoDTO> list = loaiMeoService.getListLoaimeo();
        return list;
    }

    @GetMapping("getMeo")
    public MeoDTO getMeo(@RequestParam(name="maloaimeo") Integer maloaimeo) {
        MeoDTO result = meoService.getMeoByLoaiMeo(maloaimeo);
        return result;
    }
}
