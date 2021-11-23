package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.SuvPickUpOffRoad;
import com.example.sahibindentwo.entities.dtos.SuvPickupOffRoadDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuvPickUpOffRoadDao extends JpaRepository<SuvPickUpOffRoad,Long> {

    @Query("select new com.example.sahibindentwo.entities.dtos.SuvPickupOffRoadDto" +
            "(spu.id,spu.title,spu.sellerName,spu.date,spu.price,spu.details,spu.city, spu.modelYear," +
            "spu.horsePower,spu.engineCapacity,spu.warranty,spu.swap,brand.brandName,fuel.fuelName," +
            "gear.gearName,color.colorName,spu.door,tractionType.tractionTypeName," +
            "cspu.caseTypeForSuvPickupOffRoadName)" +
            " from SuvPickUpOffRoad spu" +
            " inner join spu.brand brand" +
            " inner join spu.fuel fuel" +
            " inner join spu.gear gear" +
            " inner join spu.tractionType tractionType" +
            " inner join spu.color color" +
            " inner join spu.caseTypeForSuvPickupOffroad cspu")
    List<SuvPickupOffRoadDto> getSuvPickUpOffRoadWithDetails();

    @Query("select new com.example.sahibindentwo.entities.dtos.SuvPickupOffRoadDto" +
            "(spu.id,spu.title,spu.sellerName,spu.date,spu.price,spu.details,spu.city, spu.modelYear," +
            "spu.horsePower,spu.engineCapacity,spu.warranty,spu.swap,brand.brandName,fuel.fuelName," +
            "gear.gearName,color.colorName,spu.door,tractionType.tractionTypeName," +
            "cspu.caseTypeForSuvPickupOffRoadName)" +
            " from SuvPickUpOffRoad spu" +
            " inner join spu.brand brand" +
            " inner join spu.fuel fuel" +
            " inner join spu.gear gear" +
            " inner join spu.tractionType tractionType" +
            " inner join spu.color color" +
            " inner join spu.caseTypeForSuvPickupOffroad cspu" +
            " where spu.id=:id")
    SuvPickupOffRoadDto getSuvPickUpOffRoadById(int id);

    @Modifying
    @Query("delete from SuvPickUpOffRoad spu where spu.id=:id")
    void deleteSuvPickUpOffRoadById(int id);
}
