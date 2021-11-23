package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.TractionType;
import com.example.sahibindentwo.entities.dtos.TruckDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TractionTypeDao extends JpaRepository<TractionType,Integer> {

    @Query("select new com.example.sahibindentwo.entities.dtos.TruckDto" +
            "(t.id, t.title, t.sellerName, t.date, t.price, t.details, t.city, t.modelYear," +
            "t.horsePower, t.engineCapacity, t.warranty, t.swap," +
            " brand.brandName, fuel.fuelName, gear.gearName, color.colorName,t.maxCarriageCapacity," +
            "t.tyreCondition, tractionType.tractionTypeName,   sft.superStructureForTruckName)" +
            " from Truck t" +
            " inner join t.brand brand" +
            " inner join t.fuel fuel" +
            " inner join t.gear gear" +
            " inner join t.tractionType tractionType" +
            " inner join t.color color" +
            " inner join t.superstructureForTruck sft")
    List<TruckDto> getAllTrucksWithDetails();

    @Query("select new com.example.sahibindentwo.entities.dtos.TruckDto" +
            "(t.id, t.title, t.sellerName, t.date, t.price, t.details, t.city, t.modelYear," +
            "t.horsePower, t.engineCapacity, t.warranty, t.swap," +
            " brand.brandName, fuel.fuelName, gear.gearName, color.colorName,t.maxCarriageCapacity," +
            "t.tyreCondition, tractionType.tractionTypeName,   sft.superStructureForTruckName)" +
            " from Truck t" +
            " inner join t.brand brand" +
            " inner join t.fuel fuel" +
            " inner join t.gear gear" +
            " inner join t.tractionType tractionType" +
            " inner join t.color color" +
            " inner join t.superstructureForTruck sft" +
            " where t.id=:id")
    TruckDto getTruckDetailById(int id);

    @Modifying
    @Query("delete from Truck t where t.id=:id")
    void deleteTruckById(int id);
}
