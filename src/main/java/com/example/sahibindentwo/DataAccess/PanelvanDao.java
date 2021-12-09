package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Panelvan;
import com.example.sahibindentwo.Entities.Dtos.PanelvanDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PanelvanDao extends JpaRepository<Panelvan,Long> {
    @Query("select new com.example.sahibindentwo.Entities.Dtos.PanelvanDto" +
            "(p.id, p.title, p.sellerName, p.date, p.price, p.details, p.city, p.modelYear," +
            "p.horsePower, p.engineCapacity, p.warranty, p.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, p.seatCount, tractionType.tractionTypeName," +
            "ctfp.caseTypeForPanelvanName, cfpn.chasisForPanelvanName, lrp.licenseRegistrationPanelvanName)" +
            " from Panelvan p" +
            " inner join p.brand brand" +
            " inner join p.fuel fuel" +
            " inner join p.gear gear" +
            " inner join p.tractionType tractionType" +
            " inner join p.color color" +
            " inner join p.caseTypeForPanelvan ctfp" +
            " inner join p.chasisForPanelvan cfpn" +
            " inner join p.licenceRegistrationPanelvan lrp")
    List<PanelvanDto> getPanelvansWithDetails();

    @Query("select new com.example.sahibindentwo.Entities.Dtos.PanelvanDto" +
            "(p.id, p.title, p.sellerName, p.date, p.price, p.details, p.city, p.modelYear," +
            "p.horsePower, p.engineCapacity, p.warranty, p.swap, brand.brandName, fuel.fuelName," +
            "gear.gearName, color.colorName, p.seatCount, tractionType.tractionTypeName," +
            "ctfp.caseTypeForPanelvanName, cfpn.chasisForPanelvanName, lrp.licenseRegistrationPanelvanName)" +
            " from Panelvan p" +
            " inner join p.brand brand" +
            " inner join p.fuel fuel" +
            " inner join p.gear gear" +
            " inner join p.tractionType tractionType" +
            " inner join p.color color" +
            " inner join p.caseTypeForPanelvan ctfp" +
            " inner join p.chasisForPanelvan cfpn" +
            " inner join p.licenceRegistrationPanelvan lrp" +
            " where p.id=:id")
    PanelvanDto getPanelvanDetailById(int id);
}
