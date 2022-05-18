package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Meo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeoRepository extends JpaRepository<Meo, Integer> {
}