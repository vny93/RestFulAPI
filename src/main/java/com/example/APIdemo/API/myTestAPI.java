package com.example.APIdemo.API;

import com.example.APIdemo.DTO.NewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class myTestAPI {



    @RequestMapping(value = "/new", method = RequestMethod.POST)

    @ResponseBody

    public NewDTO createNew(@RequestBody NewDTO model) {
        System.out.println(model.getContent()+model.getTitle());
        return model;

    }

}