package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Ketqua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KetquaRepository extends JpaRepository<Ketqua, Integer> {

}