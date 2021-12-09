package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Bus;
import com.example.sahibindentwo.Entities.Dtos.BusDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusDao extends JpaRepository<Bus,Long> {

    @Query("select new com.example.sahibindentwo.Entities.Dtos.BusDto" +
            "(b.id, b.title, b.sellerName, b.date, b.price, b.details,b.city," +
            "b.modelYear, b.horsePower, b.engineCapacity, b.warranty, b.swap," +
            "brand.brandName, fuel.fuelName, gear.gearName, color.colorName," +
            "b.passengerCapacity, b.singleSeat, b.screenSizeBehindSeat," +
            "b.numberOfGears, b.fuelCapacity, b.tyreCondition)" +
            " from Bus b" +
            " inner join b.brand brand" +
            " inner join b.color color" +
            " inner join b.fuel fuel" +
            " inner join b.gear gear")
    List<BusDto> getAllBussesWithDetails();

    @Query("select new com.example.sahibindentwo.Entities.Dtos.BusDto" +
            "(b.id, b.title, b.sellerName, b.date, b.price, b.details,b.city," +
            "b.modelYear, b.horsePower, b.engineCapacity, b.warranty, b.swap," +
            "brand.brandName, fuel.fuelName, gear.gearName, color.colorName," +
            "b.passengerCapacity, b.singleSeat, b.screenSizeBehindSeat," +
            "b.numberOfGears, b.fuelCapacity, b.tyreCondition)" +
            " from Bus b" +
            " inner join b.brand brand" +
            " inner join b.color color" +
            " inner join b.fuel fuel" +
            " inner join b.gear gear" +
            " where b.id=:id")
    BusDto getBusDetailById(int id);

    @Modifying
    @Query("delete from Bus b where b.id=:id")
    void deleteBusById(int id);

    @Query("select new com.example.sahibindentwo.Entities.Dtos.BusDto" +
            "(b.id, b.title, b.sellerName, b.date, b.price, b.details,b.city," +
            "b.modelYear, b.horsePower, b.engineCapacity, b.warranty, b.swap," +
            "brand.brandName, fuel.fuelName, gear.gearName, color.colorName," +
            "b.passengerCapacity, b.singleSeat, b.screenSizeBehindSeat," +
            "b.numberOfGears, b.fuelCapacity, b.tyreCondition)" +
            " from Bus b" +
            " inner join b.brand brand" +
            " inner join b.color color" +
            " inner join b.fuel fuel" +
            " inner join b.gear gear" +
            " where b.title=:title")
    List<BusDto> getBusDetailsByTitle(String title);

    @Modifying
    @Query("update Bus b set b.km=:km where b.id=:id")
    void updateBusKm(int km,long id);
}
