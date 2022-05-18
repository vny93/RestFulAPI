package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Taikhoan;
import com.example.APIdemo.DTO.TaikhoanDTO;
import com.example.APIdemo.Mapper.TaikhoanMapper;
import com.example.APIdemo.Repositories.TaikhoanRepository;
import com.example.APIdemo.Services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


@Component
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaikhoanRepository taikhoanRepository;

//    @Override
//    public Taikhoan updateMK_TK(Taikhoan taikhoan){
//        taikhoanRepository.updateMK_TK(taikhoan.getTendangnhap(),taikhoan.getMatkhau());
//        return taikhoan;
//    }
    

    @Override
    public List<TaikhoanDTO> getListTaiKhoan(){
        List<TaikhoanDTO> result = new ArrayList<TaikhoanDTO>();
        List<Taikhoan> taikhoans = taikhoanRepository.findAll();
        for(Taikhoan tk : taikhoans){
            result.add(TaikhoanMapper.toTaikhoanDTO(tk));
        }
        return result;
    }

    @Override
    public TaikhoanDTO getTKById(String id){
        List<Taikhoan> taikhoans = taikhoanRepository.findAll();
        for(Taikhoan tk : taikhoans){
            if(tk.getTendangnhap().equals(id)){
                return TaikhoanMapper.toTaikhoanDTO(tk);
            }
        }
        return null;
    }

    @Override
    public String maHoaMK(String mk) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(mk.getBytes());
        byte[] digest = md.digest();
        String newMK = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return newMK;
    }

    @Override
    public Boolean checkDangNhap(TaikhoanDTO taikhoanDTO, String tk, String mk){
        System.out.println("tk: "+taikhoanDTO.getTendangnhap());
        System.out.println("mk: "+taikhoanDTO.getMatkhau());
        System.out.println("mk2: "+mk);
        if(taikhoanDTO.getTendangnhap().trim().equals(tk) &&
        taikhoanDTO.getMatkhau().trim().equals(mk)){
            return true;
        }
        else return false;
    }

}
