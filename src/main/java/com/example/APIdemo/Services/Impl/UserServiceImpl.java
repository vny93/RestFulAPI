package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Taikhoan;
import com.example.APIdemo.BangLaiXe.User;
import com.example.APIdemo.DTO.UserDTO;
import com.example.APIdemo.Mapper.UserMapper;
import com.example.APIdemo.Repositories.TaikhoanRepository;
import com.example.APIdemo.Repositories.UserRepository;
import com.example.APIdemo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaikhoanRepository taikhoanRepository;

    @Override
    public List<UserDTO> getListUser(){
        List<UserDTO> result = new ArrayList<UserDTO>();
        List<User> users = userRepository.findAll();
        for(User user : users){
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public List<User> getList(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public UserDTO getUserById(String id) {
        List<User> users = userRepository.findAll();
        for(User user : users){
            if(user.getEmail().equals(id)){
                return UserMapper.toUserDTO(user);
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String id){
        List<User> users = userRepository.findAll();
        for(User user : users){
            if(user.getEmail().equals(id)){
                userRepository.delete(user);
            }
        }
    }

    @Override
    public UserDTO getUserbyTK(String tk, String pass){
        List<Taikhoan> taikhoans = taikhoanRepository.findAll();
        for(Taikhoan taikhoan : taikhoans){
            if(taikhoan.getTendangnhap().equals(tk) && taikhoan.getMatkhau().equals(pass)){
                return getUserById(tk);
            }
        }
        return null;
    }
}
