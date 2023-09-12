package Hw_03_OOP.application;

import Hw_03_OOP.dto.EShop;
import Hw_03_OOP.dto.EShop_Branch;

public class Main_2 {

    public static void main(String[] args) {

        EShop android = new EShop("arm", "arm-E", "BP230807A102", 35_656, true);

        System.out.print("***Android arm: ");
        android.call();
        System.out.print("***Android arm: ");
        android.purchase();

        EShop_Branch serenity = new EShop_Branch("leg", "leg-E", "BP230708A100", 65_553, true, "IGear", "Japain");

        System.out.print("***Serenity leg: ");
        serenity.accountability();
        System.out.print("***Serenity leg: ");
        serenity.logistics();
        System.out.print("***Serenity leg: ");
        serenity.ordersFormation();
        System.out.print("***Serenity leg: ");
        serenity.call();
        System.out.print("***Serenity leg: ");
        serenity.purchase();
        System.out.println("---------------------------");

        // Child's Class methods aren't available
        EShop parent = serenity;

//        parent.acc
//        parent.log
//        parent.ord

        // Parent Class cannot be converted to the child
//        EShop_Branch child = android;
    }
}
