package task3;

public class Ship extends Vehicle {

    private String portHome;
    private int passengers;

    public Ship(int price,int speed, int age, int passengers, String portHome){
        super(price, speed,age);
        this.portHome = portHome;
        this.passengers = passengers;


    }

    public String getPortHome() {
        return portHome;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public void showGeneralInfo() {
        System.out.println("ship info");
        super.showGeneralInfo();
        System.out.println("next ship info");
        System.out.println(getPassengers());
        System.out.println(getPortHome());

    }
}
