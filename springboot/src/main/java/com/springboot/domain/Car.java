package com.springboot.domain;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private Double price;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
