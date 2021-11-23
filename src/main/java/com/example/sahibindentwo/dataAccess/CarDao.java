package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Car;
import com.example.sahibindentwo.entities.dtos.CarDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarDao extends JpaRepository<Car,Long> {
    @Query("select new com.example.sahibindentwo.entities.dtos.CarDto" +
            "(c.id, c.title, c.sellerName, c.date, c.price, c.details, c.city, c.modelYear," +
            "c.horsePower, c.engineCapacity, c.warranty, c.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, tractionType.tractionTypeName, caseTypeForCar.caseTypeForCarName)" +
            " from Car c" +
            " inner join c.brand brand" +
            " inner join c.fuel fuel" +
            " inner join c.gear gear" +
            " inner join c.color color" +
            " inner join c.tractionType tractionType" +
            " inner join c.caseTypeForCar caseTypeForCar")
    List<CarDto> getAllCarsWithDetails();

    @Query("select new com.example.sahibindentwo.entities.dtos.CarDto" +
            "(c.id, c.title, c.sellerName, c.date, c.price, c.details, c.city, c.modelYear," +
            "c.horsePower, c.engineCapacity, c.warranty, c.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, tractionType.tractionTypeName, caseTypeForCar.caseTypeForCarName)" +
            " from Car c" +
            " inner join c.brand brand" +
            " inner join c.fuel fuel" +
            " inner join c.gear gear" +
            " inner join c.color color" +
            " inner join c.tractionType tractionType" +
            " inner join c.caseTypeForCar caseTypeForCar" +
            " where c.id=:id")
    CarDto getCarDetailsById(int id);



    @Modifying
    @Query("delete from Car c where c.id=:id")
    void deleteCarById(int id);

    @Modifying
    @Query("update Car c set c.title =?1 where c.id=?2")
    void updateCarTitle(String title, long id);

    @Modifying
    @Query("update Car c set c.km =?1 where c.id=?2")
    void updateCarKm(int km, long id);



    @Query("select new com.example.sahibindentwo.entities.dtos.CarDto" +
            "(c.id, c.title, c.sellerName, c.date, c.price, c.details, c.city, c.modelYear," +
            "c.horsePower, c.engineCapacity, c.warranty, c.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, tractionType.tractionTypeName, caseTypeForCar.caseTypeForCarName)" +
            " from Car c" +
            " inner join c.brand brand" +
            " inner join c.fuel fuel" +
            " inner join c.gear gear" +
            " inner join c.color color" +
            " inner join c.tractionType tractionType" +
            " inner join c.caseTypeForCar caseTypeForCar" +
            " where c.title=:title")
    List<CarDto> getAllCarsWithDetailsByTitle(String title);
}
