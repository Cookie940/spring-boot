package com.springboot.controller;


import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller//以json 响应数据，无需配置jackson
public class Hellocontroller {

    @Autowired
    private CarService carService;



    @RequestMapping(value = "Car_selectAll",method = RequestMethod.GET)
    public ModelAndView select(){
        List<Car> cars=carService.select();
        Car car = new Car();
        car.setName("悍马");
        car.setPrice(100d);
        car.setCreateDate(new Date());
        car.setId(1);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("Car_selectAll");
        modelAndView.addObject("cars",cars);
        return modelAndView;
    }


//    @RequestMapping("hello")
//    public String hello(){
//        return  "Hello spring boot";
//    }
    @RequestMapping("hithymeleaf")
    public String hiThymeleaf(
            @RequestParam(value = "name",required = false,defaultValue = "world") String name,
            Model model
    ){
            //模型数据
            model.addAttribute("name",name);
            //视图(resources 下的模板中的htm)
            return "hello";
    }





}
