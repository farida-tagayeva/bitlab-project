package lesson8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientHandler extends Thread {
    private Socket socket;
    private int id;

    public ClientHandler() {
    }

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Scanner in = new Scanner(System.in);
            ArrayList<Book> books = new ArrayList<>();
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            PackageData data = new PackageData();

            while (true) {
                inputStream.readObject();
                books.add(data.getBook());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
