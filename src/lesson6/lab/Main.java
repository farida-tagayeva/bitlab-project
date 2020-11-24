package lesson6.lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car[] cars = new Car[10];

        Car cars1 = new Car("Mercedes", 300, 500);
        Car cars2 = new Car("Toyota", 220, 400);
        Car cars3 = new Car("Kia", 180, 300);
        Car cars4 = new Car("BMW", 300, 700);
        Car cars5 = new Car("Mercedes1", 200, 500);
        Car cars6 = new Car("Hyundai", 180, 400);

        try {
            System.out.println("Waiting all threads");
            cars1.join();
            cars2.join();
            cars3.join();
            cars4.join();
            cars5.join();
            cars6.join();
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Place 1"+cars1+"second");
        System.out.println("Place 2"+cars2+"second");
        System.out.println("Place 3"+cars3+"second");
        System.out.println("Place 4"+cars4+"second");
        System.out.println("Place 5"+cars5+"second");
        System.out.println("Place 6"+cars6+"second");


    }
}
