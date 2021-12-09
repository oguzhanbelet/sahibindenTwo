package com.example.sahibindentwo.Api.Controllers;

import com.example.sahibindentwo.Business.Abstracts.BusService;
import com.example.sahibindentwo.Entities.Concretes.Bus;
import com.example.sahibindentwo.Entities.Dtos.BusDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/busses")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Bus bus){
        this.busService.add(bus);
    }

    @GetMapping("/getAllBussesWithDetails")
    public List<BusDto> getAllBussesWithDetails(){
        return this.busService.getAllBussesWithDetails();
    }

    @GetMapping("/getBusDetailsById")
    public BusDto getBusDetailsById(@RequestParam int id){
        return this.busService.getBusDetailsById(id);
    }

    @GetMapping("/getBusDetailsByTitle")
    public List<BusDto> getBusDetailsByTitle(@RequestParam String title){
        return this.busService.getBusDetailsByTitle(title);
    }

    @DeleteMapping("/deleteBusById")
    public void deleteBusById(@RequestParam int id){
        this.busService.deleteBusById(id);
    }

    @PutMapping("/updateBusKm")
    public void updateBusKm(@RequestParam int km, @RequestParam long id){
        this.busService.updateBusKm(km, id);
    }
}
