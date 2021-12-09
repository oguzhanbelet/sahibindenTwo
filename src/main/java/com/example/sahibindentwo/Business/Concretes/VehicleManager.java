package com.example.sahibindentwo.Business.Concretes;

import com.example.sahibindentwo.Business.Abstracts.VehicleService;
import com.example.sahibindentwo.DataAccess.VehicleDao;
import com.example.sahibindentwo.Entities.Concretes.Vehicle;
import com.example.sahibindentwo.Entities.Dtos.VehicleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleManager implements VehicleService {

    private VehicleDao vehicleDao;


    public VehicleManager(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    @Override
    public void add(Vehicle vehicle) {
        this.vehicleDao.save(vehicle);
    }

    @Override
    public List<VehicleDto> getAllVehiclesWithDetails() {
        return this.vehicleDao.getAllVehiclesWithDetails();
    }

    @Override
    public VehicleDto getVehicleById(int id) {
        return this.vehicleDao.getVehicleById(id);
    }

    @Override
    public List<VehicleDto> getAllVehiclesByTitle(String title) {
        return this.vehicleDao.getAllVehiclesByTitle(title);
    }

    @Override
    public void deleteVehicleById(int id) {
        this.vehicleDao.deleteVehicleById(id);
    }

    @Override
    public void updateVehicleTitle(String title, long id) {
        this.vehicleDao.updateVehicleTitle(title,id);
    }

    @Override
    public void updateVehicleKm(int km, long id) {
        vehicleDao.updateVehicleKm(km,id);
    }


}
