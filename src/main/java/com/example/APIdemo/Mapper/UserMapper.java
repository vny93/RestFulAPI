package com.example.APIdemo.Mapper;

import com.example.APIdemo.BangLaiXe.User;
import com.example.APIdemo.DTO.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user){
        UserDTO tmp = new UserDTO();
        tmp.setEmail(user.getEmail());
        tmp.setHoten(user.getHoten());
        tmp.setSdt(user.getSdt());
        return tmp;
    }
}
