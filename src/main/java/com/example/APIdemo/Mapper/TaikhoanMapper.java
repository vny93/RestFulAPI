package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.Taikhoan;
import com.example.APIdemo.DTO.TaikhoanDTO;

public class TaikhoanMapper {
    public static TaikhoanDTO toTaikhoanDTO(Taikhoan tk){
        TaikhoanDTO tmp = new TaikhoanDTO();
        tmp.setTendangnhap(tk.getTendangnhap());
        tmp.setMatkhau(tk.getMatkhau());
        tmp.setTrangthai(tk.getTrangthai());
        return tmp;
    }
}
