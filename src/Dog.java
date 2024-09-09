import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder

public class Dog {

    private String name;
    private double age;
    private String poroda;

    public Dog(String name, double age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public String getPoroda(){
        return poroda;
    }
    public void setAge(double age){
        this.age = age;
    }
}
