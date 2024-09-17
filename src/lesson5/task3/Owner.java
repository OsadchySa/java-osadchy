package lesson5.task3;

public class Owner implements IncreasingExperience{
    private String name;
    private int age;
    private int drivingExperience;

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void  increasingExperience() {
        this.drivingExperience = this.drivingExperience + 1;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
