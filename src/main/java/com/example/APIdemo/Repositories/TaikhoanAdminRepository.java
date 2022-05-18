package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.TaikhoanAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TaikhoanAdminRepository extends JpaRepository<TaikhoanAdmin, String> {

}