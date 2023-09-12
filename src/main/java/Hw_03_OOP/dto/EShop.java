package Hw_03_OOP.dto;

import Hw_03_OOP.interfaces.IRefactorable;

import java.util.Objects;

public class EShop extends BionicProsthesis implements IRefactorable {

    private double price;
    private boolean isMaintain;

    public EShop(String limb, String model, String serialNumber, double price, boolean isMaintain) {
        super(limb, model, serialNumber);

        setPrice(price);
        setMaintain(isMaintain);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0.)
            this.price = price;
    }

    public boolean isMaintain() {
        return isMaintain;
    }

    public void setMaintain(boolean maintain) {

        isMaintain = maintain;
    }

    @Override
    public String toString() {

        return "price " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EShop eShop = (EShop) o;
        return Double.compare(price, eShop.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public void call() {

        System.out.println("Call");
    }

    public void purchase() {

        System.out.println("Purchase");
    }

    protected void exchange() {

        System.out.println("Exchange");
    }

    private void returnBack() {

        System.out.println("Return");
    }

    @Override
    public void globalNetwork() {

        System.out.println("Global network");
    }
}
