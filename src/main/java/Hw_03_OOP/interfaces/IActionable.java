package Hw_03_OOP.interfaces;

public interface IActionable {

    void move();
    default void grab() {

        System.out.println("Grab");
    }
}
