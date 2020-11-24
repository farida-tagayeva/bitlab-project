package lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("127.0.0.1",2425);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true){
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");

                String choice = in.next();

                if(choice.equals("1")){

                    System.out.println("INSERT MESSAGE:");
                    String message = in.next();



                }else if(choice.equals("0")){
                    break;
                }

            }

            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
