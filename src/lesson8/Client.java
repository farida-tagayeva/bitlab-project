package lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("");

        try{
            ArrayList<Book>books = new ArrayList<>();
            Socket socket = new Socket("127.0.0.1",2077);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData data = new PackageData();

            while (true){
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOK");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER ");

                int choice = in.nextInt();
                if (choice == 1) {
                    data.setOperationType("list1");
                    outputStream.writeObject(data);
                } else if (choice == 2) {
                   books.add(data.getBook());
                } else {
                    break;
                }
            }
        }catch ( Exception e){
            e.printStackTrace();
        }


    }
}
