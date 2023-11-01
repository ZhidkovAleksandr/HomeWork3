package Task5;

public class BluePrinter extends Printer{
    @Override
    public void print(String value) {
        System.out.println("\u001B[34m" + value + "\u001B[0m");
    }
}
