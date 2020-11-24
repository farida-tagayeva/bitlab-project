package lesson2.labka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library("LION King","Almaty");


        library.addBook(new Book(in.nextInt(),in.next(),in.next()));
        library.addBook(new Book(in.nextInt(),in.next(),in.next()));
        library.addBook(null);
        library.addBook(new Book(in.nextInt(),in.next(),in.next()));
        library.addBook(new Book(in.nextInt(),in.next(),in.next()));
        library.addBook(null);
        library.addBook(null);

        library.printBooks();
    }
}
