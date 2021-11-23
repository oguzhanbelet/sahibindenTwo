package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand, Integer> {
}
