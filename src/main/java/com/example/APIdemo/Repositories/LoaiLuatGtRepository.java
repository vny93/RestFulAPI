package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.LoaiLuatGt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiLuatGtRepository extends JpaRepository<LoaiLuatGt, Integer> {
}