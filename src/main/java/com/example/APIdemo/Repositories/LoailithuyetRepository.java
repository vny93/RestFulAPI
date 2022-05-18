package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Loailithuyet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoailithuyetRepository extends JpaRepository<Loailithuyet, Integer> {
}