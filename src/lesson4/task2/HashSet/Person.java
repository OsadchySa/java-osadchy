package lesson4.task2.HashSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<Skill>();
    private Car car;

    public Person() {
    }

    public Person(int id, String name, String surname, String email, int age, Gender gender, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email) && gender == person.gender && Objects.equals(skills, person.skills) && Objects.equals(car, person.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, age, gender, skills, car);
    }

    @Override
    public String

    toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }
}
