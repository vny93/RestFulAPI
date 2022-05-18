package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Bodethi;
import com.example.APIdemo.BangLaiXe.Cauhoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BodethiRepository extends JpaRepository<Bodethi, Integer> {

}