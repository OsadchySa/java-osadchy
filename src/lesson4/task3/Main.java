package lesson4.task3;

public class Main {
    public static void main(String[] args) {

        Zooclub zooclub = new Zooclub();

        Person person1 = new Person(1,"John");
        Person person2 = new Person(2,"Mary");

        Pet pet1 = new Pet("Dog");
        Pet pet2 = new Pet("Cat");
        Pet pet3 = new Pet("Parrot");

        zooclub.addMember(person1);
        zooclub.addMember(person2);

        zooclub.addPetToMember(person1, pet1);
        zooclub.addPetToMember(person1, pet2);
        zooclub.addPetToMember(person2, pet3);
        System.out.println(zooclub);

        zooclub.removePetFromMember(person1, pet1);
        System.out.println(zooclub);

        zooclub.removeMember(person2);
        System.out.println(zooclub);
    }
}
