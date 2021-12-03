import java.util.Scanner;
public class TypeMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String x = scanner.nextLine();
        printType(x);
        System.out.println("Type conversion to int...");
        int intx= Integer.parseInt(x);
        printType(intx);
        System.out.println("Type conversion int to float...");
        float floatx=Float.parseFloat(x);
        printType(floatx);
        scanner.close();

    }
    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {System.out.println(x + " is a float"); }
}