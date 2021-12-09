package com.example.sahibindentwo.Api.Controllers;

import com.example.sahibindentwo.Business.Abstracts.CarService;
import com.example.sahibindentwo.Entities.Concretes.Car;
import com.example.sahibindentwo.Entities.Dtos.CarDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAllCarsWithDetails")
    public List<CarDto> getAllCarsWithDetails(){
        return this.getAllCarsWithDetails();
    }

    @PostMapping("/add")
    public void add(@RequestBody Car car){
        this.carService.add(car);
    }

    @GetMapping("/getCarDetailsById")
    public CarDto getCarDetailsById(@RequestParam long id){
        return this.carService.getCarDetailsById(id);
    }

    @GetMapping("/getAllCarsWithDetailsByTitle")
    public List<CarDto> getAllCarsWithDetailsByTitle(@RequestParam String title){
        return this.carService.getAllCarsWithDetailsByTitle(title);
    }

    @DeleteMapping("deleteCarById")
    public void deleteCarById(@RequestParam long id){
        this.carService.deleteCarById(id);
    }

    @PutMapping("/updateCarTitle")
    public void updateCarTitle(@RequestParam String title, @RequestParam long id){
        this.carService.updateCarTitle(title, id);
    }

    @PutMapping("/updateCarKm")
    public void updateCarKm(@RequestParam int km, @RequestParam long id){
        this.carService.updateCarKm(km, id);
    }

}
