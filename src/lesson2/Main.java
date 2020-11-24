package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User[] users = new User[5];
        users [0] = new User();
        


        for (int i = 0; i < users.length; i++) {
            try {
                String name = in.next();
                String surname = in.next();
                int age = in.nextInt();


            } catch (ArrayStoreException e) {
                e.printStackTrace();
                int age = 0;
            }
        }
    }
}
