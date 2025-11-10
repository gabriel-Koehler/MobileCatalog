package com.mobile_store.mobile_store.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobileProduct {
    private Long idMobileProduct;
    private String companyName;
    private String modelName;
    private String mobileWeight;
    private String ram;
    private String frontCamera;
    private String backCamera;
    private String processor;
    private String batteryCapacity;
    private String screenSize;
    private String launchedPriceUSD;
    private String launchedYear;

    public MobileProduct(String companyName, String modelName, String mobileWeight, String ram, String frontCamera,
            String backCamera, String processor, String batteryCapacity, String screenSize, String launchedPriceUSD,
            String launchedYear) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.mobileWeight = mobileWeight;
        this.ram = ram;
        this.frontCamera = frontCamera;
        this.backCamera = backCamera;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.launchedPriceUSD = launchedPriceUSD;
        this.launchedYear = launchedYear;
    }

    
}

