package com.week1;

import java.awt.*;
import java.util.Date;

public class Main {
    static Car car1 = new Car(1995,5, new Date(94,11,25), 105555, Color.BLACK, Car.Model.TOYOTA);

    public static void main(String[] args) {
        System.out.println("Modeli: "+car1.getModel());
        System.out.println("Üretim Yýlý: "+car1.getProductionDate());
        System.out.println("Trafiðe Çýktýðý Yýl: "+car1.getYear());
        System.out.println("Kapasitesi: "+car1.getCapacity());
        System.out.println("Km: "+car1.getKm());
    }
}
