package com.example.sahibindentwo.Business.Abstracts;

import com.example.sahibindentwo.DataAccess.BrandDao;
import com.example.sahibindentwo.Entities.Concretes.Brand;

import java.util.List;

public interface BrandService {
    void add(Brand brand);
    List<BrandDao> getAllBrands();
    void deleteById(int id);
    void updateBrandName(String brandName, int id);
}
