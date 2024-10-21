package com.example.car.services;

import com.example.car.repositories.CarRepository;
import com.example.car.models.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {


    private final CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(UUID id) {
        return carRepository.getReferenceById(id);
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car editCar(UUID id, Car car) {
        return null;
    }

    public void deleteCar(UUID id) {
        carRepository.deleteById(id);
    }
}
