package com.example.sahibindentwo.Entities.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {
    private long id;
    private String title;
    private String sellerName;
    private Date date;
    private double price;
    private String details;
    private String city;
    private int modelYear;
    private int horsePower;
    private int engineCapacity;
    private boolean warranty;
    private String brandName;
    private String fuelName;
    private String gearName;
    private String colorName;
}
