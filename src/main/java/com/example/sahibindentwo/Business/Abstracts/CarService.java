package com.example.sahibindentwo.Business.Abstracts;

import com.example.sahibindentwo.Entities.Concretes.Car;
import com.example.sahibindentwo.Entities.Dtos.CarDto;

import java.util.List;

public interface CarService {
    void add(Car car);
    List<CarDto> getAllCarsWithDetails();
    CarDto getCarDetailsById(long id);
    List<CarDto> getAllCarsWithDetailsByTitle(String title);
    void deleteCarById(long id);
    void updateCarTitle(String title, long id);
    void updateCarKm(int km, long id);
}
