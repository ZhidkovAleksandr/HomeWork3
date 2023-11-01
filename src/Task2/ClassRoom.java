package Task2;

public class ClassRoom {

    private int numberOfPupils = 4;

    private Pupil pup1;
    private Pupil pup2;
    private Pupil pup3;
    private Pupil pup4;

    public ClassRoom(){
        this.pup1 = new ExcelentPupil();
        this.pup2 = new GoodPupil();
        this.pup3 = new GoodPupil();
        this.pup4 = new BadPupil();
    }

    public ClassRoom(Pupil pup1, Pupil pup2, Pupil pup3, Pupil pup4){
        this.pup1 = pup1;
        this.pup2 = pup2;
        this.pup3 = pup3;
        this.pup4 = pup4;
    }

    public ClassRoom(Pupil pup1, Pupil pup2, Pupil pup3){
        this.pup1 = pup1;
        this.pup2 = pup2;
        this.pup3 = pup3;

        this.numberOfPupils = 3;

    }

    public ClassRoom(Pupil pup1, Pupil pup2){
        this.pup1 = pup1;
        this.pup2 = pup2;

        this.numberOfPupils =2;

    }

    public ClassRoom(Pupil pup1){
        this.pup1 = pup1;
        this.numberOfPupils =1;


    }

    private void ifoOfPupils(Pupil[] array, int counter){

        counter = 1;

        for(Pupil e : array){
            System.out.println("учень "+ counter);
            e.study();
            e.read();
            e.write();
            e.relax();
            counter++;

        }

    }
    public void showOurClass(){

        if (numberOfPupils>1){
            //int counter = numberOfPupils-1;
            Pupil[] arPup;
            switch (numberOfPupils){
                case 2:
                    arPup = new Pupil[numberOfPupils];
                    arPup[0] = this.pup1;
                    arPup[1] = this.pup2;
                    ifoOfPupils(arPup,numberOfPupils);
                    break;
                case 3:
                    arPup = new Pupil[numberOfPupils];
                    arPup[0] = this.pup1;
                    arPup[1] = this.pup2;
                    arPup[2] = this.pup3;
                    ifoOfPupils(arPup,numberOfPupils);
                    break;
                case 4:
                    arPup = new Pupil[numberOfPupils];
                    arPup[0] = this.pup1;
                    arPup[1] = this.pup2;
                    arPup[2] = this.pup3;
                    arPup[3] = this.pup4;
                    ifoOfPupils(arPup,numberOfPupils);
                    break;
            }



        }else{
            System.out.println("єдиний учень");
            this.pup1.study();
            this.pup1.read();
            this.pup1.write();
            this.pup1.relax();
        }

    }


}
