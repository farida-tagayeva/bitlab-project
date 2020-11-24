package lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        try{
            ServerSocket server = new ServerSocket(2077);
            System.out.println("Server started");

            while (true){
                Socket socket = server.accept();
                System.out.println("Client connected");

                ClientHandler clientHandler = new ClientHandler();
                clientHandler.start();

                ArrayList<Book>books = new ArrayList<>();
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                while (true){
                    outputStream.writeObject("data");
                    inputStream.readObject();



                    outputStream.close();
                    inputStream.close();

                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
