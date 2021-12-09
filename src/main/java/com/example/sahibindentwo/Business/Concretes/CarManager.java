package com.example.sahibindentwo.Business.Concretes;

import com.example.sahibindentwo.Business.Abstracts.CarService;
import com.example.sahibindentwo.DataAccess.CarDao;
import com.example.sahibindentwo.Entities.Concretes.Car;
import com.example.sahibindentwo.Entities.Dtos.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {
        this.carDao.save(car);
    }

    @Override
    public List<CarDto> getAllCarsWithDetails() {
        return this.carDao.getAllCarsWithDetails();
    }

    @Override
    public CarDto getCarDetailsById(long id) {
        return this.getCarDetailsById(id);
    }

    @Override
    public List<CarDto> getAllCarsWithDetailsByTitle(String title) {
        return this.carDao.getAllCarsWithDetailsByTitle(title);
    }

    @Override
    public void deleteCarById(long id) {
        this.carDao.deleteCarById(id);
    }

    @Override
    public void updateCarTitle(String title, long id) {
        this.carDao.updateCarTitle(title, id);
    }

    @Override
    public void updateCarKm(int km, long id) {
        this.carDao.updateCarKm(km, id);
    }
}
