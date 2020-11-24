package lesson5.lab;

import lesson3.Player;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = new Game();



        while(true){
            System.out.println("  PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("  PRESS 3 TO PLAY GAME");
            System.out.println("  PRESS 0 TO EXIT");

            int choice = in.nextInt();

            if( choice==1 ){
                System.out.println("Game  name: ");
                String gamename = in.next();

                System.out.println("IP address: ");
                String ipaddress = in.next();

                System.out.println("PORT: ");
                int port = in.nextInt();
                 game = new Game(gamename, ipaddress, port);
                saveGame(game);

            }else if (choice==2){
                System.out.println("Nickname: ");
                String nikename = in.next();

                System.out.println("Rating: ");
                double rating = in.nextDouble();
                Player player = new Player(nikename,rating);
                game.addPlayers(player);
                saveGame(game);

            }else if (choice==3){
                System.out.println(game.toString());
            }else{
                break;
            }
        }
    }

    static void saveGame(Game game){
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("memory.txt"));
            objectOutputStream.writeObject(game);
            objectOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }




}
