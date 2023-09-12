package Hw_03_OOP.dto;

import Hw_03_OOP.abstracts.Accessories;

public class Implantation extends Accessories {

    private double price;

    public Implantation(boolean isImplanted, double price) {
        super(isImplanted);

        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0.)
            this.price = price;
    }

    @Override
    public void turnOn() {

        System.out.println("turned on");
    }
}
