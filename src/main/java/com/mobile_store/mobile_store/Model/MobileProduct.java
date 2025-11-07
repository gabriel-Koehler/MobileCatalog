package com.mobile_store.mobile_store.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobileProduct {
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
}

