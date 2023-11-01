package task3;

public class Main {

    public static void main(String[] args) {
        Car randcar = new Car(5000,325,2023);
        randcar.showGeneralInfo();
        Plane justPlane = new Plane(250000,900,1980,10000,250);
        justPlane.showGeneralInfo();
        Ship someBoat = new Ship(350000,90,2003,450,"Istanbul");
        someBoat.showGeneralInfo();
    }

}
