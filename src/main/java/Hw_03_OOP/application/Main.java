package Hw_03_OOP.application;

import Hw_03_OOP.dto.BionicProsthesis;
import Hw_03_OOP.dto.EShop;
import Hw_03_OOP.dto.EShop_Branch;
import Hw_03_OOP.dto.Implantation;
import Hw_03_OOP.interfaces.IActionable;

public class Main {

    public static void main(String[] args) {

        IActionable iActionable = new IActionable() {

            public void transform() {

                System.out.println("anonymous_Transform");
            }

            public void grip() {

                System.out.println("anonymous_Grip");
            }

            @Override
            public void move() {
                transform();
                grip();

                System.out.println("anonymous_Super move");
                System.out.println("---------------------------");
            }
        };

        iActionable.move();

        BionicProsthesis leg = new BionicProsthesis("leg", "leg-D", "BP230908A121");
        BionicProsthesis arm = new BionicProsthesis("arm", "arm-D", "BP230908A123");

        System.out.print("interface_Bionic leg: ");
        leg.move();
        System.out.print("interface_Bionic arm: ");
        arm.grab();
        System.out.println("---------------------------");

        Implantation implant = new Implantation(true, 5_800);

        System.out.print("abstract_Implant is ");
        implant.turnOn();
        System.out.print("abstract_Implant is ");
        implant.turnOff();
        System.out.println("---------------------------");

        EShop android = new EShop("arm", "arm-E", "BP230807A102", 35_656, true);

        System.out.print("interface_Android arm: ");
        android.move();
        System.out.print("interface_Android arm: ");
        android.grab();
        System.out.println("---------------------------");
    }
}
