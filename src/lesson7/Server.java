package lesson7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        try{

            ServerSocket server = new ServerSocket(2425);
            System.out.println("Waiting a client");
            Socket socket = server.accept();
            System.out.println("Client connected");
            System.out.println("Client connected");
            ObjectOutputStream outStream =
                    new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());

            String message = "";
            MessageData text;
            while((text=(MessageData)inStream.readObject())!=null){

                System.out.println(MessageData.class);

            }

            inStream.close();
            outStream.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
