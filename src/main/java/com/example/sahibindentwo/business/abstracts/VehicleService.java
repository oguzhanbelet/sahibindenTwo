package com.example.sahibindentwo.business.abstracts;

import com.example.sahibindentwo.entities.Vehicle;
import com.example.sahibindentwo.entities.dtos.VehicleDto;

import java.util.List;

public interface VehicleService {

    void add(Vehicle vehicle);
    List<VehicleDto> getAllVehiclesWithDetails();
    VehicleDto getVehicleById(int id);
    List<VehicleDto> getAllVehiclesByTitle(String title);
    void deleteVehicleById(int id);
    void updateVehicleTitle(String title, long id);
    void updateVehicleKm(int km, long id);

}
