package com.example.sahibindentwo.Api.Controllers;

import com.example.sahibindentwo.Business.Abstracts.VehicleService;
import com.example.sahibindentwo.Entities.Concretes.Vehicle;
import com.example.sahibindentwo.Entities.Dtos.VehicleDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/getAllVehiclesWithDetails")
    public List<VehicleDto> getAllVehiclesWithDetails(){
        return this.vehicleService.getAllVehiclesWithDetails();
    }

    @PostMapping("/add")
    public void add(@RequestBody Vehicle vehicle){
        this.vehicleService.add(vehicle);
    }

    @GetMapping("/getVehicleById")
    public VehicleDto getVehicleById(@RequestParam int id){
        return this.vehicleService.getVehicleById(id);
    }

    @GetMapping("/getAllVehiclesByTitle")
    public List<VehicleDto> getAllVehiclesByTitle(@RequestParam String title){
        return this.vehicleService.getAllVehiclesByTitle(title);
    }

    @DeleteMapping("/deleteVehicleById")
    public void deleteVehicleById(@RequestParam int id){
        this.vehicleService.deleteVehicleById(id);
    }

    @PutMapping("/updateVehicleTitle")
    public void updateVehicleTitle(@RequestParam String title, @RequestParam long id){
        this.vehicleService.updateVehicleTitle(title,id);
    }

    @PutMapping("/updateVehicleKm")
    public void updateVehicleKm(@RequestParam int km, @RequestParam long id){
        this.vehicleService.updateVehicleKm(km, id);
    }
}
