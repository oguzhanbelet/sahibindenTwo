package com.example.sahibindentwo.Entities.Concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "vehicle_id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "seller_name")
    private String sellerName;

    @Column(name = "date")
    private Date date;

    @Column(name = "price")
    private double price;

    @Column(name = "details", length = 2000)
    private String details;

    @Column(name = "city")
    private String city;

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "vehicle_KM")
    private int km;

    @Column(name = "horse_power")
    private int horsePower;

    @Column(name = "engine_CC")
    private int engineCapacity;

    @Column(name = "warranty")
    private boolean warranty;

    @ManyToOne()
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne()
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne()
    @JoinColumn(name = "fuel_id")
    private Fuel fuel;

    @ManyToOne()
    @JoinColumn(name = "gear_id")
    private Gear gear;
}
