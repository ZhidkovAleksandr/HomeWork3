package Task2;

import java.util.Scanner;

public class Main {

    static void creatingClassRoom() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть необхідну кількість учнів, не більше 4х");
        int quantityPupipl = sc.nextInt();

        ClassRoom ourClassRoom;

        switch (quantityPupipl){

            case 1:
                 ourClassRoom = new ClassRoom(createPupil());
                 ourClassRoom.showOurClass();
                break;
            case 2:
                 ourClassRoom = new ClassRoom(createPupil(),createPupil());
                 ourClassRoom.showOurClass();
                 break;
            case 3:
                ourClassRoom = new ClassRoom(createPupil(),createPupil(), createPupil());
                ourClassRoom.showOurClass();
            case 4:
                ourClassRoom = new ClassRoom(createPupil(),createPupil(), createPupil(), createPupil());
                ourClassRoom.showOurClass();
                break;
            default:
                ourClassRoom = new ClassRoom();
                ourClassRoom.showOurClass();


        }

    }

    static Pupil createPupil(){
        //
        Scanner scanPup = new Scanner(System.in);
        System.out.println("Від 1 до 3, від поганого учня до кращого");
        int pupType = scanPup.nextInt();
        if (pupType>3&&pupType<0){
            createPupil();
        }else{
            switch (pupType) {
                case 1:

                    return new BadPupil();
                case 2:
                    return new GoodPupil();
                case 3:
                    return new ExcelentPupil();

            }
        }
        return new BadPupil();
    }

    public static void main(String[] args) {
        creatingClassRoom();
    }
}
