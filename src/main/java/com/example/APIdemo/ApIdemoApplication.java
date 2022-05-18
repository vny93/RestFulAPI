package com.example.APIdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.APIdemo.BangLaiXe.Cauhoi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
@SpringBootApplication
public class ApIdemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(ApIdemoApplication.class, args);
		System.out.println("HIhi");
	}

}
