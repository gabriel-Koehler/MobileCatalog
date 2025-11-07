package com.mobile_store.mobile_store.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mobile_store.mobile_store.Model.MobileProduct;

@Service
public class MobileProductService {
    List<MobileProduct> mobiles= new ArrayList<>();
    public MobileProductService(){
        mobiles.add(new MobileProduct(
            "Apple",
            "iPhone 16 128GB",
            "174g",
            "6GB",
            "12MP",
            "48MP",
            "A17 Bionic",
            "3,600mAh",
            "6.1 inches",
            "799,00",
            "2024"));
        mobiles.add(new MobileProduct(
            "Xiaomi",
            "Redmi Note 12",
            "188g",
            "4GB",
            "8MP",
            "50MP + 8MP + 2MP",
            "Snapdragon 4 Gen 1",
            "5000mAh",
            "6.67 in",
            "169",
            "2023"));
        mobiles.add(new MobileProduct(
            "Samsung",
            "Galaxy A04s",
            "195g",
            "4GB",
            "5MP",
            "50MP + 2MP + 2MP",
            "Exynos 850",
            "5000mAh",
            "6.5 in",
            "149",
            "2022"
        ));
        mobiles.add(new MobileProduct(
            "Infinix",
            "Hot 20 5G",
            "204g",
            "4GB",
            "8MP",
            "50MP + 2MP",
            "Dimensity 810",
            "5000mAh",
            "6.6 in",
            "180",
            "2022"
        ));
    }
    public List<MobileProduct> findAll(){
        return mobiles;
    }
    public void addMobileProduct(MobileProduct newMobileProduct){
        mobiles.add(newMobileProduct);
    }    
}

