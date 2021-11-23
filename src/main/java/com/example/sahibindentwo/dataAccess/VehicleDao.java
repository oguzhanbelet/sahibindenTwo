package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Vehicle;
import com.example.sahibindentwo.entities.dtos.VehicleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleDao extends JpaRepository<Vehicle,Long> {

    @Query("select new com.example.sahibindentwo.entities.dtos.VehicleDto" +
            "(v.id, v.title, v.sellerName, v.date, v.price, v.details, v.city, v.modelYear," +
            "v.horsePower, v.engineCapacity, v.warranty, brand.brandName,fuel.fuelName," +
            "gear.gearName, color.colorName)" +
            " from Vehicle v" +
            " inner join v.brand brand" +
            " inner join v.fuel fuel" +
            " inner join v.gear gear" +
            " inner join v.color color")
    List<VehicleDto> getAllVehiclesWithDetails();

    @Query("select new com.example.sahibindentwo.entities.dtos.VehicleDto" +
            "(v.id, v.title, v.sellerName, v.date, v.price, v.details, v.city, v.modelYear," +
            "v.horsePower, v.engineCapacity, v.warranty, brand.brandName,fuel.fuelName," +
            "gear.gearName, color.colorName)" +
            " from Vehicle v" +
            " inner join v.brand brand" +
            " inner join v.fuel fuel" +
            " inner join v.gear gear" +
            " inner join v.color color" +
            " where v.id=:id")
    VehicleDto getVehicleById(int id);

    @Query("select new com.example.sahibindentwo.entities.dtos.VehicleDto" +
            "(v.id, v.title, v.sellerName, v.date, v.price, v.details, v.city, v.modelYear," +
            "v.horsePower, v.engineCapacity, v.warranty, brand.brandName,fuel.fuelName," +
            "gear.gearName, color.colorName)" +
            " from Vehicle v" +
            " inner join v.brand brand" +
            " inner join v.fuel fuel" +
            " inner join v.gear gear" +
            " inner join v.color color" +
            " where v.title like :title")
    List<VehicleDto> getAllVehiclesByTitle(String title);

    @Modifying
    @Query("delete from Vehicle v where v.id=:id")
    void deleteVehicleById(int id);

    @Modifying
    @Query("update Vehicle v set v.title=?1 where v.id=?2")
    void updateVehicleTitle(String title, long id);

    @Modifying
    @Query("update Vehicle v set v.km=?1 where v.id=?2")
    void updateVehicleKm(int km, long id);
}
