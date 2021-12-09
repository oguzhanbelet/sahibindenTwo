package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Motorcycle;
import com.example.sahibindentwo.Entities.Dtos.MotorcycleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MotorcycleDao extends JpaRepository<Motorcycle,Long> {

    @Query("select new com.example.sahibindentwo.Entities.Dtos.MotorcycleDto" +
            "(m.id, m.title, m.sellerName, m.date, m.price, m.details, m.city, m.modelYear," +
            "m.horsePower, m.engineCapacity, m.warranty, m.swap, brand.brandName, " +
            "fuel.fuelName, gear.gearName, color.colorName, ctfm.coolingTypeForMotorcycleName," +
            "noc.numberOfCylinderName, tt.timingTypeName)" +
            " from Motorcycle m" +
            " inner join m.brand brand" +
            " inner join m.fuel fuel" +
            " inner join m.gear gear" +
            " inner join m.color color" +
            " inner join m.coolingTypeForMotorcycle ctfm" +
            " inner join m.numberOfCylinder noc" +
            " inner join m.timingType tt")
    List<MotorcycleDto> getMotorcyclesWithDetails();

    @Query("select new com.example.sahibindentwo.Entities.Dtos.MotorcycleDto" +
            "(m.id, m.title, m.sellerName, m.date, m.price, m.details, m.city, m.modelYear," +
            "m.horsePower, m.engineCapacity, m.warranty, m.swap, brand.brandName, " +
            "fuel.fuelName, gear.gearName, color.colorName, ctfm.coolingTypeForMotorcycleName," +
            "noc.numberOfCylinderName, tt.timingTypeName)" +
            " from Motorcycle m" +
            " inner join m.brand brand" +
            " inner join m.fuel fuel" +
            " inner join m.gear gear" +
            " inner join m.color color" +
            " inner join m.coolingTypeForMotorcycle ctfm" +
            " inner join m.numberOfCylinder noc" +
            " inner join m.timingType tt" +
            " where m.id=:id")
    MotorcycleDto getMotorcycleById(int id);
}
