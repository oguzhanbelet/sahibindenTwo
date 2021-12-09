package com.example.sahibindentwo.Api.Controllers;

import com.example.sahibindentwo.Business.Abstracts.BrandService;
import com.example.sahibindentwo.DataAccess.BrandDao;
import com.example.sahibindentwo.Entities.Concretes.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Brand brand){
        this.brandService.add(brand);
    }

    @GetMapping("/getAllBrands")
    public List<BrandDao> getAllBrands(){
        return this.brandService.getAllBrands();
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam int id){
        this.brandService.deleteById(id);
    }

    @PutMapping("/updateBrandName")
    public void updateBrandName(@RequestParam String brandName, @RequestParam int id){
        this.brandService.updateBrandName(brandName, id);
    }
}
