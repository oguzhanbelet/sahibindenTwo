package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorDao extends JpaRepository<Color, Integer> {


}
