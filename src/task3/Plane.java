package task3;

public class Plane extends Vehicle{

    private int altitude;
    private int passengers;

public Plane(int price, int speed, int age, int altitude, int passengers){

    super(price, speed, age);
    this.altitude = altitude;
    this.passengers = passengers;


}

    public int getAltitude() {
        return altitude;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public void showGeneralInfo() {
        System.out.println("plane info");
        super.showGeneralInfo();
        System.out.println("next plane info");
        System.out.println(getAltitude());
        System.out.println(getPassengers());
    }
}
