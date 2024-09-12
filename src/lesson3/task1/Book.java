package lesson3.task1;

public class Book implements Printable{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("This book title is " + title);
    }

    @Override
    public String toString() {
        return "This book title is " + title;
    }
}
