package Task5;

public class Main {

    public static void main(String[] args) {
        /*
        Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Printer.
        У тілі класу створіть метод void print(String value), який виводить на екран
        значення аргументу. Реалізуйте можливість того, щоб у разі успадкування від
        даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки,
        передані як аргументи методів, виводилися різними кольорами.
        Обязательно используйте приведення типів.

        //
        Важко було зрозуміти умову завдання.
        Мені здалося, що тут треба було навести типи.
        //
         */
        String phrase = "Hello, world!";

        Printer basePrinter = new Printer();

        RedPrinter redP = new RedPrinter();
        GreenPrinter greenP = new GreenPrinter();
        BluePrinter blueP = new BluePrinter();



        Printer modRed = (Printer) redP;
        modRed.print(phrase);

        Printer modGreen = (Printer) greenP;
        modGreen.print(phrase);

        Printer modBlue = (Printer) blueP;
        modBlue.print(phrase);




    }




}
