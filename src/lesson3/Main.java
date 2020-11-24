package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Player>players = new ArrayList<Player>();


        Player player1 = new Player("qwerty",200,30);
        Player player2 = new Player("Lion",450,26);
        Player player3 = new Player("Rain",670,23);
        Player player4 = new Player("Mai",230,30);
        Player player5 = new Player("Kai",560,24);
        Player player6 = new Player("Vend",800,33);
        Player player7 = new Player("Sony",200,21);
        Player player8 = new Player("Lia",340,19);
        Player player9 = new Player("Combo",890,29);
        Player player10 = new Player("Danny",500,20);


        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);


        double prices = 0;
        int sumAge = 0;
        for (Player p :players){
            prices += p.getPrice();
            sumAge += p.getAge();
        }

        System.out.println(prices/players.size());
        System.out.println(sumAge);


    }
}
