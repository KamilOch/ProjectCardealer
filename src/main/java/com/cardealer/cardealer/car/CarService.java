package com.cardealer.cardealer.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {


    private List<Car> cars;

    @Autowired
    public CarService(List<Car> cars) {
        this.cars = cars;

        cars.add(new Car("Audi", "80", "combi", 1980 ));
        cars.add(new Car("Fiat", "Siena", "checkback", 1999 ));

    }

    public void addCar(Car car) {
        cars.add(car);
    }


    public List<Car> getCars() {
        return cars;


    }
}
