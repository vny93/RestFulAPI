package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Taikhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TaikhoanRepository extends JpaRepository<Taikhoan, String> {
//    @Modifying
//    @Transactional
//    @Query("UPDATE Taikhoan SET matkhau =:mk  WHERE tendangnhap=:tendn")
//    void updateMK_TK(@Param("tendangnhap") String tendn, @Param("matkhau") String mk);
//
//    @Query("UPDATE Taikhoan SET trangthai =:tt  WHERE tendangnhap=:tendn")
//    void updateTT_TK(@Param("tendangnhap") String tendn, @Param("trangthai") String tt);

}