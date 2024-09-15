package lesson4.task2.TreeSet;

import lesson4.task2.HashSet.Car;
import lesson4.task2.HashSet.Gender;
import lesson4.task2.HashSet.Skill;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> personsTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = Integer.compare(o1.getSkills().size(), o2.getSkills().size());
                if (result == 0) {
                    return Integer.compare(o1.getId(), o2.getId());
                }
                return result;
            }
        });

        Car car01 = new Car("Audi", 2016, 210);
        Person person01 = new Person(1, "Grisha", "Jonson", "grishaj@com", 43, Gender.MALE, car01);
        person01.getSkills().add(new Skill("java", 10));
        person01.getSkills().add(new Skill("js", 7));
        person01.getSkills().add(new Skill("c++", 8));

        Car car02 = new Car("BMW", 2018, 220);
        Person person02 = new Person(2, "Svitlana", "Smith", "svit@com", 32, Gender.FEMALE, car02);
        person02.getSkills().add(new Skill("python", 9));
        person02.getSkills().add(new Skill("html", 8));
        person02.getSkills().add(new Skill("css", 7));
        person02.getSkills().add(new Skill("c++", 10));

        Car car03 = new Car("Mercedes", 2020, 240);
        Person person03 = new Person(3, "John", "Doe", "john@com", 28, Gender.MALE, car03);
        person03.getSkills().add(new Skill("javascript", 8));
        person03.getSkills().add(new Skill("react", 9));

        Car car04 = new Car("Tesla", 2021, 250);
        Person person04 = new Person(4, "Sara", "Connor", "sara@com", 30, Gender.FEMALE, car04);
        person04.getSkills().add(new Skill("go", 7));
        person04.getSkills().add(new Skill("docker", 8));
        person04.getSkills().add(new Skill("kubernetes", 7));

        personsTreeSet.add(person01);
        personsTreeSet.add(person02);
        personsTreeSet.add(person03);
        personsTreeSet.add(person04);

        for (Person p : personsTreeSet){
            System.out.println(p);
        }
    }
}
