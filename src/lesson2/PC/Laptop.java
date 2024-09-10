package lesson2.PC;

import lombok.Data;

@Data


public class Laptop {
    private TypeOfLaptop typeOfLaptop;

    public Laptop() {}

    public Laptop(TypeOfLaptop typeOfLaptop) {
        this.typeOfLaptop = typeOfLaptop;
    }

    public TypeOfLaptop getTypeOfLaptop() {
        return typeOfLaptop;
    }

    public void setTypeOfLaptop(TypeOfLaptop typeOfLaptop) {
        this.typeOfLaptop = typeOfLaptop;
    }

    @Override
    public String toString() {
        return "lesson2.PC.Laptop{" +
                "typeOfLaptop=" + typeOfLaptop +
                '}';
    }
}
