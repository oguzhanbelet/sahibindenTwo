package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Gear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearDao extends JpaRepository<Gear, Integer> {

}
