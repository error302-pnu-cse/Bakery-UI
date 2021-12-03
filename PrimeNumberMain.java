import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        final int a = scanner.nextInt();
        System.out.print("");
        for (int i = 2; i <= 10; i++) {
           System.out.println("Prime Numbers less than or equal to " + i + " = " + Arrays.toString(getPrimeNumber(i)));
        }
        scanner.close();
    }
    private static int[] getPrimeNumber (final int n) {
        int[] array = new int[10];
        int cnt = 0;
        for (int i = 2; i <=n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) if (i % j == 0) count++;
            if (count == 2) {
                array[cnt] = i;
                cnt++;
            }
        }
        final int[] array1 = new int [cnt];
        for(int i= 0; i < cnt; i ++) array1[i]=array[i];
        return array1;
    }
}
