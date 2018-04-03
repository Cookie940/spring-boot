package com.springboot.controller;


import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//以json 响应数据，无需配置jackson
public class Hellocontroller {

    @Autowired
    private CarService carService;

    @GetMapping("select")
    public List<Car> select(){
        return carService.select();
    }


    @RequestMapping("hello")
    public String hello(){
        return  "Hello spring boot";
    }





}
