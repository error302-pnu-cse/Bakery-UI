import java.util.Scanner;
public class BooleanMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        System.out.println("Number1 : " + num1 + " Number2 : " + num2);
        final Boolean a = (num1>num2);
        System.out.println("Number1 > Number2 ? " + printType(a));
        final Boolean b = (num1<num2);
        System.out.println("Number1 < Number2 ? " + printType(b));
        final Boolean c = (num1==num2);
        System.out.println("Number1 == Number2 ? " + printType(c));
        scanner.close();
    }
    private static String printType(Boolean x) {
        if(x) return ("true");
        else return ("false");
    }
}
