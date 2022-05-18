package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Loaide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaideRepository extends JpaRepository<Loaide, Integer> {
}