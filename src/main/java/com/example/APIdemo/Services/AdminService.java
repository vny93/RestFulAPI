package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.APIdemo.Repositories.AdminRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repo;
    public List<Admin> listAll() {
        return (List<Admin>) repo.findAll();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

    public Optional<Admin> get(String id) {
        return repo.findById(id);
    }
    public void save(Admin ad) {
        repo.save(ad);
    }

    public void insert(String email, String cmnd, String hoten, String sdt) {
        repo.insert(email, cmnd, hoten, sdt);
    }


}
