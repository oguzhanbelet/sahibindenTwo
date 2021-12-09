package com.example.sahibindentwo.Business.Abstracts;

import com.example.sahibindentwo.Entities.Concretes.Bus;
import com.example.sahibindentwo.Entities.Dtos.BusDto;

import java.util.List;

public interface BusService {
    void add(Bus bus);
    List<BusDto> getAllBussesWithDetails();
    BusDto getBusDetailsById(int id);
    List<BusDto> getBusDetailsByTitle(String title);
    void deleteBusById(int id);
    void updateBusKm(int km, long id);
}
