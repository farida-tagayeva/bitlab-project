package lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        try{
            ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream("memory.dat"));
            students=(ArrayList<Student>)objectInputStream.readObject();
            objectInputStream.close();

        }catch (Exception e){
            e.printStackTrace();

        }


        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if (choice == 1){
                System.out.println(" Name: ");
                String name = in.next();
                System.out.println(" Surname: ");
                String  surname = in.next();

                Student student = new Student(name,surname);
                while (true){
                    System.out.println("PRESS [1] TO ADD SUBJECT ");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU");

                    int choice2 = in.nextInt();

                    if (choice2==1){
                        System.out.println("Name: ");
                        String name2 = in.next();
                        System.out.println("Credits: ");
                        int credits = in.nextInt();
                        Subject subject = new Subject(name,credits);

                    }else {
                        break;
                    }
                }
                students.add(student);

                try{
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
                    objectOutputStream.writeObject(students);
                    objectOutputStream.close();



                }catch (Exception e){
                    e.printStackTrace();
                }



            }else if (choice==2){
                for (int i=0; i< students.size(); i++){
                    System.out.println(students.get(i).toString());
                }
            }else{
                break;

            }
        }
    }
}
