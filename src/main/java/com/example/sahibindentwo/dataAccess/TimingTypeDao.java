package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.TimingType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimingTypeDao extends JpaRepository<TimingType,Integer> {
}
