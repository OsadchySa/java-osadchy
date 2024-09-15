package lesson4.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Ivan", 39);
        User user2 = new User("Petro", 22);
        User user3 = new User("Stepan", 33);
        User user4 = new User("Andriy", 42);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);
        users.sort(Comparator.comparing(User :: getAge).reversed());
        System.out.println(users);


        ArrayList<String> elements = new ArrayList<>();
        elements.add("apple");
        elements.add("banana");
        elements.add("cherry");
        elements.add("date");
        elements.add("elephant");
        elements.add("fig");
        elements.add("grape");
        elements.add("honey");
        elements.add("ice");
        elements.add("jungle");
        elements.add("kiwi");
        elements.add("lemon");
        elements.add("mango");
        elements.add("nectarine");
        elements.add("orange");
        Collections.sort(elements);
        System.out.println(elements);
    }
}
