package com.example.mapping.service;

import com.example.mapping.model.Car;
import com.example.mapping.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }



    public Car addCar(Car car) {
        car = carRepository.save(car);
        return car;
    }


    public List<Car> displayCar() {
        return carRepository.findAll();
    }


    public void deleteCar(Long carId) {
        carRepository.deleteById(carId);
    }



}
