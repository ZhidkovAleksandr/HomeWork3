package Task4;

import java.util.Scanner;

public class Main {

    static void workWithDoc(DocumentWorker docWorker){
        Scanner scan = new Scanner(System.in);
        String command;

        while (true){
            System.out.println("choose the command: save s/ edit e/ open o/ quit q");
            command = scan.next();
            switch (command){
                case "s" :
                    docWorker.saveDocument();
                    break;
                case "e" :
                    docWorker.editDocument();
                    break;
                case "o" :
                    docWorker.openDocument();
                    break;
                case "q" :
                    return;
            }

        }

    }

    public static void main(String[] args) {
        int pasPro = 123;
        int pasExp = 111;

        Scanner sc = new Scanner(System.in);
        System.out.println("type in the key");
        int enteredKey = sc.nextInt();

        switch (enteredKey){

            case 123:
                ProDocumentWorker proDoc = new ProDocumentWorker();
                DocumentWorker newProDoc = (DocumentWorker) proDoc;
                workWithDoc(newProDoc);
                break;
            case 111:
                ExpertDocumentWorker expDoc = new ExpertDocumentWorker();
                DocumentWorker newExpDoc = (DocumentWorker) expDoc;
                workWithDoc(newExpDoc);
                break;
            default:
                DocumentWorker simpDoc = new DocumentWorker();
                workWithDoc(simpDoc);






        }


    }

}
