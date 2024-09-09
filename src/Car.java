import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder

public class Car {

    private String model;
    private double power;
    private double volumeEngine;
    private boolean turbo;
    public Car(String model, double power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }
    public String getModel(){
        return model;
    }
    public double getPower(){
        return power;
    }
    public double getVolumeEngine(){
        return volumeEngine;
    }
    public boolean getTurbo(){
        return turbo;
    }

}