package com.example.APIdemo.Repositories;


import com.example.APIdemo.BangLaiXe.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}