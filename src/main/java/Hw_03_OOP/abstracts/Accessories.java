package Hw_03_OOP.abstracts;

public abstract class Accessories {

    private boolean isImplanted;

    public Accessories(boolean isImplanted) {

        setImplanted(isImplanted);
    }

    public boolean isImplanted() {
        return isImplanted;
    }

    public void setImplanted(boolean implanted) {

        isImplanted = implanted;
    }

    public abstract void turnOn();

    public void turnOff() {

        System.out.println("turned off");
    }
}
