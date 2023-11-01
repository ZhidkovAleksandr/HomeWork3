package task3;

public class Car extends Vehicle {

    public Car(int price,int speed, int age){

        super(price, speed, age);

    }

    @Override
    public void showGeneralInfo() {
        System.out.println("info about car");
        super.showGeneralInfo();
    }
}
