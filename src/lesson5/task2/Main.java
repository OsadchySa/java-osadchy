package lesson5.task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {76,64,23,7342,12,2,675,888,12,73645,23,56,90,7890,9853,5,4,44,440,333};
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        System.out.println(Arrays.toString(sortedNumbers));

        List<Integer> multOf3 = Arrays.stream(numbers).filter(n -> n % 3 == 0).boxed().collect(Collectors.toList());
        System.out.println(multOf3);

        List<Integer> multOf10 = Arrays.stream(numbers).filter(n -> n % 10 == 0).boxed().collect(Collectors.toList());
        System.out.println(multOf10);

        Arrays.stream(numbers).forEach(System.out::println);

        int[] multBy3 = Arrays.stream(numbers).map(n -> n * 3).toArray();
        System.out.println(Arrays.toString(multBy3));
    }
}
