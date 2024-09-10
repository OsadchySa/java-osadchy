package lesson2.Applicant;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ("Audi", 2016, 210);
        Applicant applicant1 = new Applicant(1, "Piter", "Jonson", "peterj@com", 43, Gender.MALE, car1);
        applicant1.getSkills().add(new Skill("java", 10));
        applicant1.getSkills().add(new Skill("js", 10));
        applicant1.getSkills().add(new Skill("c++", 10));
        System.out.println(applicant1);
    }
}