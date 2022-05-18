package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Loaibang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaibangRepository extends JpaRepository<Loaibang, Integer> {
}