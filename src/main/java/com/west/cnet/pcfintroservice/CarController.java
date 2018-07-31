package com.west.cnet.pcfintroservice;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
public class CarController {
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ArrayList<Car> getCars() {
        /*MultiValueMap<String, Car> map = new LinkedMultiValueMap<>();

        map.add("cars", new Car("Toyota", "Camry", 2018));
        map.add("cars", new Car("Honda", "Civic", 2017));
        map.add("cars", new Car("Volkswagen", "Jetta", 2019));

        return map;*/
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Honda", "Civic", 2017));
        cars.add(new Car("Volkswagen", "Jetta", 2019));

        return cars;
    }
}
