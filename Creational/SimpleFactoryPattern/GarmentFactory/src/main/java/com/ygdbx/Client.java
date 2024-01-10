package com.ygdbx;

import com.ygdbx.product.Garment;

public class Client {
    public static void main(String[] args) {
        String garmentType = XMLUtil.getGarmentType();
//        Garment shoes = GarmentFactory.factoryMethod("shoes");
//        if (shoes != null) {
//            shoes.sale();
//        }

        Garment clothes = GarmentFactory.factoryMethod(garmentType);
        if (clothes != null) {
            clothes.sale();
        }
    }
}
