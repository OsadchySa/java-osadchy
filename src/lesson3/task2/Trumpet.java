package lesson3.task2;

public class Trumpet implements Instrument{
    private double diameter;
    public Trumpet(double diameter) {
        this.diameter = diameter;
    }
    public void play() {
        System.out.println("Now is playing trumpet, its diameter is " + diameter);
    }

    @Override
    public String
    toString() {
        return "Now is playing trumpet, its diameter is " + diameter;
    }
}
