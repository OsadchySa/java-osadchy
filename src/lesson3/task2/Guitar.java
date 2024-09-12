package lesson3.task2;

public class Guitar implements Instrument{
    private int numOfStrings;
    public Guitar(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }
    public void play () {
        System.out.println("Now is playing guitar, its number of strings is " + numOfStrings);
    }

    @Override
    public String toString() {
        return "Now is playing guitar, its number of strings is " + numOfStrings;
    }
}
