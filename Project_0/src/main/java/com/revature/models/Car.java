package com.revature.models;

public class Car {

    private int car_id;

    private String car_name;

    private int car_cost;

    //no args constructor
    public Car() {
    }

    //all args constructor
    public Car(int car_id, String car_name, int car_cost) {
        this.car_id = car_id;
        this.car_name = car_name;
        this.car_cost = car_cost;
    }

    //some args constructor (all but id)
    public Car(String car_name, int car_cost) {
        this.car_name = car_name;
        this.car_cost = car_cost;
    }

    public int getCar_id(){
        return car_id;
    }

    //getters and setters
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getCar_cost() {
        return car_cost;
    }

    public void setCar_cost(int car_cost) {
        this.car_cost = car_cost;
    }

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", car_name='" + car_name + '\'' +
                ", car_cost=" + car_cost +
                '}';
    }

}
