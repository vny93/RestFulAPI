package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.LoaiMeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiMeoRepository extends JpaRepository<LoaiMeo, Integer> {
}