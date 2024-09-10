package lesson2.PC;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class Pc {
    private Laptop laptop;

    public Pc(Laptop laptop) {
        this.laptop = laptop;
    }
}
