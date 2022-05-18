package com.example.APIdemo.Mapper;


import com.example.APIdemo.BangLaiXe.Ketqua;
import com.example.APIdemo.DTO.KetquaDTO;

public class KetqauMapper {
    public static KetquaDTO toKetquaDTO(Ketqua ketqua){
        KetquaDTO tmp = new KetquaDTO();
        tmp.setId(ketqua.getId());
        tmp.setPhuongan(ketqua.getPhuongan());
        tmp.setLuotthi(ketqua.getLuotthi());
        return tmp;
    }
}
