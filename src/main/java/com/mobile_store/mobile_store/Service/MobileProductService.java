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
            mobiles.size()+1L,
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
            mobiles.size()+1L,
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
            mobiles.size()+1L,
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
            mobiles.size()+1L,
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
        newMobileProduct.setIdMobileProduct(mobiles.size()+1L);
        mobiles.add(newMobileProduct);
    }    
    public void deleteMobileProduct(Long id){
        mobiles.removeIf((e)-> e.getIdMobileProduct().equals(id));
    }
    public void updateMobileProduct(MobileProduct updateMobileProduct){
        MobileProduct findMobileProduct =(MobileProduct) mobiles.stream().filter((e)-> e.getIdMobileProduct().equals(updateMobileProduct.getIdMobileProduct())).findAny().orElse(null);
        mobiles.add(mobiles.indexOf(findMobileProduct),updateMobileProduct);
    }
    public MobileProduct findById(Long id){
        return (MobileProduct) mobiles.stream().filter((e)->e.getIdMobileProduct().equals(id)).findAny().orElse(null) ;
    }
}

