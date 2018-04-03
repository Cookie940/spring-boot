package com.springboot.service;

import com.springboot.domain.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {

    public List<Car> select(){
        List<Car> list = new ArrayList<>();
        Car car1 = new Car();
        car1.setName("众泰");
        car1.setPrice(300d);
        Car car = new Car();
        list.add(car1);
        car.setName("皮卡");
        car.setPrice(100d);
        list.add(car);
        return list;
    }

}
