package com.example.mapping.controller;

import com.example.mapping.model.Car;
import com.example.mapping.service.CarService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/listCar")
    public ResponseEntity<?> displayCars() {
        return ResponseEntity.ok(carService.displayCar());
    }


    @PostMapping("/addCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car updated = carService.addCar(car);
        return new ResponseEntity(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteCar/{carId}")
    public HttpStatus deleteCar(@PathVariable("carId") Long carId) {
        carService.deleteCar(carId);
        return HttpStatus.FORBIDDEN;
    }

}
