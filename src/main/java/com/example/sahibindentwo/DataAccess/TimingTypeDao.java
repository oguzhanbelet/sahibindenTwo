package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.TimingType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimingTypeDao extends JpaRepository<TimingType,Integer> {
}
