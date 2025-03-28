package com.barkachni.PiLezelefons.service;

import com.barkachni.PiLezelefons.entity.Brand;
import java.util.List;

public interface IBrandService {
    List<Brand> retrieveAllBrands();
    Brand retrieveBrandById(Long brandId);
    Brand addBrand(Brand b);
    void removeBrand(Long brandId);
    Brand modifyBrand(Brand brand);
    Brand findBrandByName(String name);

}