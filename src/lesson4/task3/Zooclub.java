package lesson4.task3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Zooclub {
    private Map<Person, List<Pet>> club;

    public Zooclub() {
        this.club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.add(pet);
        }
    }

    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.remove(pet);
        }
    }

    public void removeMember(Person person) {
        club.remove(person);
    }



    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}