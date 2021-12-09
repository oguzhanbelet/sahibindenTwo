package com.example.sahibindentwo.Business.Concretes;

import com.example.sahibindentwo.Business.Abstracts.BusService;
import com.example.sahibindentwo.DataAccess.BusDao;
import com.example.sahibindentwo.Entities.Concretes.Bus;
import com.example.sahibindentwo.Entities.Dtos.BusDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusManager implements BusService {

    private BusDao busDao;

    public BusManager(BusDao busDao) {
        this.busDao = busDao;
    }

    @Override
    public void add(Bus bus) {
        this.busDao.save(bus);
    }

    @Override
    public List<BusDto> getAllBussesWithDetails() {
        return this.busDao.getAllBussesWithDetails();
    }

    @Override
    public BusDto getBusDetailsById(int id) {
        return this.busDao.getBusDetailById(id);
    }

    @Override
    public List<BusDto> getBusDetailsByTitle(String title) {
        return this.busDao.getBusDetailsByTitle(title);
    }

    @Override
    public void deleteBusById(int id) {
        this.busDao.deleteBusById(id);
    }

    @Override
    public void updateBusKm(int km, long id) {
        this.busDao.updateBusKm(km,id);
    }
}
