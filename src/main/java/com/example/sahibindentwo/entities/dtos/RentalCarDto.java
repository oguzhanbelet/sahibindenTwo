package com.example.sahibindentwo.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalCarDto {
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

    private int weeklyCost;
    private int monthlyCost;
    private boolean privateDriver;
    private boolean insurance;
    private boolean deposit;

    private String tractionTypeName;
    private String caseTypeForCarName;
    private String paymentMethodForRentalCarName;
}
