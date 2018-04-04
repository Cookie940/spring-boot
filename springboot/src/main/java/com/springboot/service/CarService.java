package com.springboot.service;

import com.springboot.domain.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class CarService {

    public List<Car> select(){
        List<Car> list = new ArrayList<>();
        Car car1 = new Car();
        car1.setName("众泰");
        car1.setPrice(100d);
        car1.setCreateDate(new Date());
        car1.setId(1);
        Car car = new Car();
        car.setName("悍马");
        car.setPrice(1000d);
        car.setCreateDate(new Date());
        car.setId(2);
        list.add(car1);
        list.add(car);
        return list;
    }

}
