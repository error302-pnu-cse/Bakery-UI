import java.util.ArrayList;
import java.util.Scanner;
public class BinaryMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final ArrayList<Integer> result = new ArrayList<>();
        int num = n;
        while(num>0) {
            if(num%2==0) result.add(0);
            else result.add(1);
            num/=2;
        }
        System.out.printf("Number %d in Binary Number: ", n);
        for (int i = result.size()-1; 0 <= i ; i --) System.out.print(result.get(i));
        System.out.println();
        scanner.close();
    }
}
