package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Gear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearDao extends JpaRepository<Gear, Integer> {

}
