package lesson2.PC;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(TypeOfLaptop.WORKSTATION);
        Pc pc1 = new Pc(laptop1);
        System.out.println(pc1);
    }
}
