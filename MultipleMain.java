import java.util.Scanner;
public class MultipleMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        if(n%2 == 0 && n%3 != 0) System.out.printf("%d is a multiple of 2\n", n);
        else if(n%2 != 0 && n%3 == 0) System.out.printf("%d is a multiple of 3\n", n);
        else if(n%2 == 0 && n%3 == 0) System.out.printf("%d is a multiple of 2 and 3\n", n);
        else System.out.printf("%d is not a multiple of 2 and 3\n", n);
        scanner.close();
    }
}
