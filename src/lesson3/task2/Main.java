package lesson3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        Guitar guitar1 = new Guitar(5);
        Guitar guitar2 = new Guitar(6);
        Drum drum1 = new Drum(52.5);
        Drum drum2 = new Drum(64.2);
        Trumpet trumpet1 = new Trumpet(15.1);
        Trumpet trumpet2 = new Trumpet(12.3);
        instruments.add(guitar1);
        instruments.add(guitar2);
        instruments.add(drum1);
        instruments.add(drum2);
        instruments.add(trumpet1);
        instruments.add(trumpet2);

        for (Instrument instrument: instruments) {
            System.out.println(instrument);
        }
    }
}
