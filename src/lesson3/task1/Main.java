package lesson3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> listOfBooksAndMagazines = new ArrayList<>();

        Book book1 = new Book("Moby-Dick");
        Book book2 = new Book("The Great Gatsby");
        listOfBooksAndMagazines.add(book1);
        listOfBooksAndMagazines.add(book2);

        Magazine magazine1 = new Magazine("Tech World");
        Magazine magazine2 = new Magazine("Science Daily");
        listOfBooksAndMagazines.add(magazine1);
        listOfBooksAndMagazines.add(magazine2);

        for (Printable printable : listOfBooksAndMagazines) {
            System.out.println(printable);
        }
    }
}
