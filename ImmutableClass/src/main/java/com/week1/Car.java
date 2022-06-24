package com.week1;

import java.awt.*;
import java.util.Date;

public final class Car {
    private final int year;
    private final int capacity;
    private final Date productionDate;
    private final int km;
    private final Color color;
    private final Model model;

    enum Model {
        TOYOTA,
        FORD,
        MAZDA,
        HYUNDAI
    }

    public Car(int year, int capacity, Date productionDate, int km, Color color, Model model) {
        this.year = year;
        this.capacity = capacity;
        this.productionDate = productionDate;
        this.km = km;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }
}
