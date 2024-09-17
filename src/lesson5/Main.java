package lesson5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("apple"));
        fruits.add(new Fruit("cherry"));
        fruits.add(new Fruit("date"));
        fruits.add(new Fruit("elderberry"));
        fruits.add(new Fruit("fig"));
        fruits.add(new Fruit("banana"));
        fruits.add(new Fruit("nectarine"));
        fruits.add(new Fruit("quince"));
        fruits.add(new Fruit("mango"));
        fruits.add(new Fruit("lemon"));
        fruits.add(new Fruit("honeydew"));
        fruits.add(new Fruit("grape"));
        fruits.add(new Fruit("kiwi"));
        fruits.add(new Fruit("orange"));
        System.out.println(fruits);


        List<Fruit> streamFruits = fruits.stream()
                .sorted(Comparator.comparing(Fruit::getName))
                .filter(fruit -> fruit.getName().length() < 5)
                .collect(Collectors.toList());
        streamFruits.forEach(System.out::println);
    }
}
