package lesson4.task2.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Person> persons = new HashSet<>();

        Car car1 = new Car("Audi", 2016, 210);
        Person person1 = new Person(1, "Piter", "Jonson", "peterj@com", 43, Gender.MALE, car1);
        person1.getSkills().add(new Skill("java", 10));
        person1.getSkills().add(new Skill("js", 7));
        person1.getSkills().add(new Skill("c++", 8));

        Car car2 = new Car("BMW", 2018, 220);
        Person person2 = new Person(2, "Anna", "Smith", "anna@com", 32, Gender.FEMALE, car2);
        person2.getSkills().add(new Skill("python", 9));
        person2.getSkills().add(new Skill("html", 8));
        person2.getSkills().add(new Skill("css", 7));


        Car car3 = new Car("Mercedes", 2020, 240);
        Person person3 = new Person(3, "John", "Doe", "john@com", 28, Gender.MALE, car3);
        person3.getSkills().add(new Skill("javascript", 8));
        person3.getSkills().add(new Skill("react", 9));
        person3.getSkills().add(new Skill("node.js", 7));


        Car car4 = new Car("Tesla", 2021, 250);
        Person person4 = new Person(4, "Sara", "Connor", "sara@com", 30, Gender.FEMALE, car4);
        person4.getSkills().add(new Skill("go", 7));
        person4.getSkills().add(new Skill("docker", 8));
        person4.getSkills().add(new Skill("kubernetes", 7));


        Car car5 = new Car("Ford", 2015, 200);
        Person person5 = new Person(5, "Alex", "Brown", "alex@com", 35, Gender.MALE, car5);
        person5.getSkills().add(new Skill("java", 9));
        person5.getSkills().add(new Skill("spring", 8));
        person5.getSkills().add(new Skill("hibernate", 9));


        Car car6 = new Car("Honda", 2014, 190);
        Person person6 = new Person(6, "Emily", "White", "emily@com", 27, Gender.FEMALE, car6);
        person6.getSkills().add(new Skill("python", 10));
        person6.getSkills().add(new Skill("django", 9));
        person6.getSkills().add(new Skill("flask", 7));


        Car car7 = new Car("Toyota", 2019, 230);
        Person person7 = new Person(7, "Michael", "Green", "michael@com", 40, Gender.MALE, car7);
        person7.getSkills().add(new Skill("c#", 8));
        person7.getSkills().add(new Skill(".net", 9));
        person7.getSkills().add(new Skill("azure", 8));


        Car car8 = new Car("Nissan", 2013, 180);
        Person person8 = new Person(8, "Jessica", "Taylor", "jessica@com", 25, Gender.FEMALE, car8);
        person8.getSkills().add(new Skill("swift", 9));
        person8.getSkills().add(new Skill("ios", 10));
        person8.getSkills().add(new Skill("objective-c", 7));


        Car car9 = new Car("Volkswagen", 2017, 210);
        Person person9 = new Person(9, "David", "Johnson", "david@com", 36, Gender.MALE, car9);
        person9.getSkills().add(new Skill("php", 8));
        person9.getSkills().add(new Skill("laravel", 9));
        person9.getSkills().add(new Skill("symfony", 8));


        Car car10 = new Car("Chevrolet", 2016, 200);
        Person person10 = new Person(10, "Olivia", "Brown", "olivia@com", 29, Gender.FEMALE, car10);
        person10.getSkills().add(new Skill("ruby", 8));
        person10.getSkills().add(new Skill("rails", 9));
        person10.getSkills().add(new Skill("javascript", 7));


        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getGender() == Gender.MALE) {
                personIterator.remove();
            }
        }
        for (Person p : persons){
            System.out.println(p);
        }
    }
}
