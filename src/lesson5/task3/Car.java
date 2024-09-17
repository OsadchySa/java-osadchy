package lesson5.task3;

public class Car implements Upgrade{
    private String brand;
    private double power;
    private Owner owner;
    private double price;
    private int year;

    public Car(String brand, double power, Owner owner, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public void upgradeEngine() {
        this.power = this.power * 1.1;
    }
}
