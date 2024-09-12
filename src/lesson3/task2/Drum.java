package lesson3.task2;

public class Drum implements Instrument{
    private double size;
    public Drum(double size) {
        this.size = size;
    }
    public void play() {
        System.out.println("Now is playing drum, its size " + size + " cm");
    };

    @Override
    public String toString() {
        return "Now is playing drum, its size " + size +
                " cm";
    }
}
