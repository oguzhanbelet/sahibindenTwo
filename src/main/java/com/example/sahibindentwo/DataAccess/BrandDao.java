package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandDao extends JpaRepository<Brand, Integer> {
    @Query("select new com.example.sahibindentwo.Entities.Dtos.BrandDto" +
            "(b.brandId, b.brandName)" +
            " from Brand b")
    List<BrandDao> getAllBrands();

    @Modifying
    @Query("update Brand b set b.brandName =?1 where b.brandId =?2")
    void updateBrandName(String brandName, int id);


}
