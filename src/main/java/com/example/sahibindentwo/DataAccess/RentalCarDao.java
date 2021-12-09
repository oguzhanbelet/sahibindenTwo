package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.RentalCar;
import com.example.sahibindentwo.Entities.Dtos.RentalCarDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentalCarDao extends JpaRepository<RentalCar,Long> {

    @Query("select new com.example.sahibindentwo.Entities.Dtos.RentalCarDto" +
            "(rc.id, rc.title, rc.sellerName, rc.date, rc.price, rc.details, rc.city, rc.modelYear," +
            "rc.horsePower, rc.engineCapacity, rc.warranty, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, rc.weeklyCost, rc.monthlyCost, rc.privateDriver," +
            "rc.insurance, rc.deposit, tractionType.tractionTypeName, caseTypeForCar.caseTypeForCarName," +
            "pmfrc.paymentMethodForRentalCarName)" +
            " from RentalCar rc" +
            " inner join rc.brand brand" +
            " inner join rc.fuel fuel" +
            " inner join rc.gear gear" +
            " inner join rc.color color" +
            " inner join rc.tractionType tractionType" +
            " inner join rc.caseTypeForCar caseTypeForCar" +
            " inner join rc.paymentMethodForRentalCar pmfrc")
    List<RentalCarDto> getAllRentalCarsWithDetails();

    @Query("select new com.example.sahibindentwo.Entities.Dtos.RentalCarDto" +
            "(rc.id, rc.title, rc.sellerName, rc.date, rc.price, rc.details, rc.city, rc.modelYear," +
            "rc.horsePower, rc.engineCapacity, rc.warranty, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, rc.weeklyCost, rc.monthlyCost, rc.privateDriver," +
            "rc.insurance, rc.deposit, tractionType.tractionTypeName, caseTypeForCar.caseTypeForCarName," +
            "pmfrc.paymentMethodForRentalCarName)" +
            " from RentalCar rc" +
            " inner join rc.brand brand" +
            " inner join rc.fuel fuel" +
            " inner join rc.gear gear" +
            " inner join rc.color color" +
            " inner join rc.tractionType tractionType" +
            " inner join rc.caseTypeForCar caseTypeForCar" +
            " inner join rc.paymentMethodForRentalCar pmfrc" +
            " where rc.id =: id")
    RentalCarDto getRentalCarWithDetailsById(int id);

    @Modifying
    @Query("delete from RentalCar rc where rc.id=:id")
    void deleteRentalCarById(int id);

    @Modifying
    @Query("update RentalCar rc set rc.km=?1 where rc.id =?2")
    void updateRentalCarKm(int km, long id);

    @Modifying
    @Query("update RentalCar rc set rc.weeklyCost=?1 where rc.id =?2")
    void updateRentalCarPrice(int weeklyCost, long id);

}
