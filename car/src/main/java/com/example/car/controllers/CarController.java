package com.example.car.controllers;

import com.example.car.models.Car;
import com.example.car.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable UUID id){
        return carService.getCarById(id);
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @PutMapping("car/{id}")
    public Car editCar(@RequestBody UUID id, @RequestBody Car car){
        return carService.editCar(id, car);
    }

    @DeleteMapping("car/{id}")
    public void deleteCar(@PathVariable UUID id){
        carService.deleteCar(id);
    }







}