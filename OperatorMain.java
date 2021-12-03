import java.util.Scanner;
public class OperatorMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        float aa = a, bb = b;
        System.out.printf("%d / %d = %,.3f%n", a, b, aa/bb);
        System.out.printf("%d = %d X %d + %d%n", a, a/b, b, a%b);
        scanner.close();
    }
}
