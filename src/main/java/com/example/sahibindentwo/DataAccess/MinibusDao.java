package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Minibus;
import com.example.sahibindentwo.Entities.Dtos.MinibusDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MinibusDao extends JpaRepository<Minibus,Long> {
    @Query("select new com.example.sahibindentwo.Entities.Dtos.MinibusDto" +
            "(m.id, m.title, m.sellerName, m.date, m.price, m.details, m.city, m.modelYear," +
            "m.horsePower, m.engineCapacity, m.warranty, m.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, m.seatCount, tractionType.tractionTypeName)" +
            " from Minibus m" +
            " inner join m.brand brand" +
            " inner join m.fuel fuel" +
            " inner join m.gear gear" +
            " inner join m.color color" +
            " inner join m.tractionType tractionType")
    List<MinibusDto> getAllMinibusesWithDetails();

    @Query("select new com.example.sahibindentwo.Entities.Dtos.MinibusDto" +
            "(m.id, m.title, m.sellerName, m.date, m.price, m.details, m.city, m.modelYear," +
            "m.horsePower, m.engineCapacity, m.warranty, m.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, m.seatCount, tractionType.tractionTypeName)" +
            " from Minibus m" +
            " inner join m.brand brand" +
            " inner join m.fuel fuel" +
            " inner join m.gear gear" +
            " inner join m.color color" +
            " inner join m.tractionType tractionType" +
            " where m.id=:id")
    MinibusDto getMinibusWithDetailsById(int id);

    @Modifying
    @Query("delete from Minibus m where m.id=:id")
    void deleteMinibusById(int id);
}
