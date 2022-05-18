package com.example.APIdemo.Controller;

import com.example.APIdemo.BangLaiXe.Bodethi;
import com.example.APIdemo.DTO.BodethiDTO;
import com.example.APIdemo.DTO.CauhoiDTO;
import com.example.APIdemo.Services.BodethiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bodethi/")
public class BodethiController {
    @Autowired
    private BodethiService bodethiService;

    @GetMapping("getBodethi")
    public BodethiDTO getBode(@RequestParam(name="maloaibang") Integer maloaibang, @RequestParam(name="maloaide") Integer maloaide) {
        BodethiDTO bodethi = bodethiService.getBoDe(maloaibang,maloaide);
        return bodethi;
    }
}
