package com.example.sahibindentwo.Business.Concretes;

import com.example.sahibindentwo.Business.Abstracts.BrandService;
import com.example.sahibindentwo.DataAccess.BrandDao;
import com.example.sahibindentwo.Entities.Concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private final BrandDao brandDao;

    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public void add(Brand brand) {
        this.brandDao.save(brand);
    }

    @Override
    public List<BrandDao> getAllBrands() {
        return this.brandDao.getAllBrands();
    }

    @Override
    public void deleteById(int id) {
        this.brandDao.deleteById(id);
    }

    @Override
    public void updateBrandName(String brandName, int id) {
        this.updateBrandName(brandName,id);
    }
}
