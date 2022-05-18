package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.User;
import com.example.APIdemo.DTO.UserDTO;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<UserDTO> getListUser();

    List<User> getList();

    UserDTO getUserById(String id);

    void saveUser(User user);

    void deleteUser(String id);

    UserDTO getUserbyTK(String tk, String pass);
}
