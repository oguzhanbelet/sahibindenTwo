package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.SemiTrailerTruck;
import com.example.sahibindentwo.entities.dtos.SemiTrailerTruckDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SemiTrailerTruckDao extends JpaRepository<SemiTrailerTruck,Long> {

    @Query("select new com.example.sahibindentwo.entities.dtos.SemiTrailerTruckDto" +
            "(stt.id, stt.title, stt.sellerName, stt.date, stt.price, stt.details, stt.city," +
            "stt.modelYear, stt.horsePower, stt.engineCapacity, stt.warranty, stt.swap," +
            "brand.brandName, fuel.fuelName, gear.gearName, color.colorName, stt.tyreCondition," +
            "stt.bedCapacity, stt.trailer)" +
            " from SemiTrailerTruck stt" +
            " inner join stt.brand brand" +
            " inner join stt.color color" +
            " inner join stt.fuel fuel" +
            " inner join stt.gear gear")
    List<SemiTrailerTruckDto> getAllSemiTrailerTrucksWithDetails();

    @Query("select new com.example.sahibindentwo.entities.dtos.SemiTrailerTruckDto" +
            "(stt.id, stt.title, stt.sellerName, stt.date, stt.price, stt.details, stt.city," +
            "stt.modelYear, stt.horsePower, stt.engineCapacity, stt.warranty, stt.swap," +
            "brand.brandName, fuel.fuelName, gear.gearName, color.colorName, stt.tyreCondition," +
            "stt.bedCapacity, stt.trailer)" +
            " from SemiTrailerTruck stt" +
            " inner join stt.brand brand" +
            " inner join stt.color color" +
            " inner join stt.fuel fuel" +
            " inner join stt.gear gear" +
            " where stt.id=:id")
    SemiTrailerTruckDto getSemiTrailerTruckWithDetailById(int id);

    @Modifying
    @Query("delete from SemiTrailerTruck stt where stt.id=:id")
    void deleteSemiTrailerTruckById(int id);
}
