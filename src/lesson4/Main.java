package lesson4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("  PRESS [1] TO ADD USERS\n" +
                    "\n" +
                    "        PRESS [2] TO LIST USERS\n" +
                    "\n" +
                    "        PRESS [3] TO DELETE USERS\n" +
                    "\n" +
                    "        PRESS [4] TO EXIT\n" +
                    "\n" +
                    " ");
            int choice = in.nextInt();


            if (choice == 1) {
                System.out.println("Insert id");
                int id = in.nextInt();

                System.out.println("Insert login");
                String login = in.next();

                System.out.println("Insert password ");
                String password = in.next();

                User users = new User(id,login,password);
                ArrayList<User> users1 = new ArrayList<User>();
                users1.add(users);
                saveUsersList(users1);

            } else if (choice == 2) {


            } else {
                break;
            }
        }

    }



    public static ArrayList<User> getUsersList() {
        ArrayList<User> users1 = new ArrayList<>();
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("memory.txt"));
            for (User u : users1) {
                write.write(u.getId());
                write.write(u.getLogin());
                write.write(u.getPassword());
            }
            write.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return users1;
    }

    public static void saveUsersList(ArrayList<User> users) {
        ArrayList<User> users1 = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("memory.txt"));
                String id;
                User user = null;

                while ( (id= reader.readLine()) != null) {
                    int id2 = Integer.parseInt(id);
                    String login = reader.readLine();
                    String password = reader.readLine();
                }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}












