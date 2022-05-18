package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.Taikhoan;
import com.example.APIdemo.DTO.TaikhoanDTO;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public interface TaiKhoanService {
  //  Taikhoan updateMK_TK(Taikhoan taikhoan);

    List<TaikhoanDTO> getListTaiKhoan();

    TaikhoanDTO getTKById(String id);

    String maHoaMK(String mk) throws NoSuchAlgorithmException;

    Boolean checkDangNhap(TaikhoanDTO taikhoanDTO, String tk, String mk);
}
