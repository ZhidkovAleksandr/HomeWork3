package task3;

public class Vehicle {
    private int price;
    private int speed;
    private int age;

    public Vehicle(int price, int speed, int age) {
        this.price = price;
        this.speed = speed;
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public void showGeneralInfo(){
        System.out.println("general info");
        System.out.println(getAge());
        System.out.println(getPrice());
        System.out.println(getSpeed());
    }

}
