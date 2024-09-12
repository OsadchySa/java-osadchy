package lesson3.task1;

public class Magazine implements Printable{

    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("This magazine title is " + title);
    }

    @Override
    public String toString() {
        return "This magazine title is " + title;
    }

}
