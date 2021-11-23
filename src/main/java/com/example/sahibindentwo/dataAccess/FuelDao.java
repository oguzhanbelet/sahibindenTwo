package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Fuel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelDao extends JpaRepository<Fuel, Integer> {


}
