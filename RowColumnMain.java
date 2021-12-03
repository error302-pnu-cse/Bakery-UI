import java.util.Scanner;
import java.util.Arrays;
public class RowColumnMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tow numbers: ");
        final int n = scanner.nextInt(), m = scanner.nextInt();
        final int[][] array = new int [30][30];
        int cnt = 1;
        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < m ; j ++) {
                array[i][j]=cnt;
                cnt++;
            }
        }
        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < m ; j ++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}