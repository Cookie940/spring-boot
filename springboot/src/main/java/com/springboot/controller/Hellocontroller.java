package com.springboot.controller;


import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//以json 响应数据，无需配置jackson
@RequestMapping("/car")
public class Hellocontroller {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "Car_selectAll",method = RequestMethod.GET)
    public ResponseEntity<?> select(){
        return new ResponseEntity<>(carService.select(), HttpStatus.OK);
    }


    @RequestMapping("hello")
    public String hello(){
        return  "Hello spring boot";
    }





}
