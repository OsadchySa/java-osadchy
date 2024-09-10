package lesson2.Papyrus;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(20, 380);
        Magazine magazine1 = new Magazine(15, 540, 0.8);
        Comics comics1 = new Comics(14, 75, "John Walker");
        System.out.println(book1);
        System.out.println(magazine1);
        System.out.println(comics1);
    }
}
