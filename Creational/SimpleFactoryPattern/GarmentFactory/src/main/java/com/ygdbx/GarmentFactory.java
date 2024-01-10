package com.ygdbx;

import com.ygdbx.product.Garment;
import com.ygdbx.product.conceteproduct.Clothes;
import com.ygdbx.product.conceteproduct.Shoes;

public class GarmentFactory {
    public static Garment factoryMethod(String productName) {
        if (productName.equalsIgnoreCase("shoes")){
            return new Shoes("blue", "fashion", 250);
        } else if (productName.equalsIgnoreCase("clothes")){
            return new Clothes("blue", "fashion", 250);
        } else {
            return null;
        }
    }
}
