package Hw_03_OOP.dto;

import Hw_03_OOP.interfaces.IActionable;

import java.util.Objects;

public class BionicProsthesis implements IActionable {

    private String limb = "No limb";
    private String model = "No model";
    private String serialNumber = "No serial number";

    public BionicProsthesis(String limb, String model, String serialNumber) {

        setLimb(limb);
        setModel(model);
        setSerialNumber(serialNumber);
    }

    public String getLimb() {
        return limb;
    }

    public void setLimb(String limb) {

        if (limb != null && !limb.isEmpty())
            this.limb = limb;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model != null && !model.isEmpty())
            this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {

        if (serialNumber != null && !serialNumber.isEmpty())
            this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {

        return limb + ", " + model + ", " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BionicProsthesis that = (BionicProsthesis) o;
        return Objects.equals(limb, that.limb) && Objects.equals(model, that.model) && Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limb, model, serialNumber);
    }

    @Override
    public void move() {

        System.out.println("Move");
    }

    @Override
    public void grab() {

        IActionable.super.grab();
    }
}
