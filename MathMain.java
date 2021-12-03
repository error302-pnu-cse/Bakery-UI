import java.util.Arrays;
import java.util.Scanner;
public class MathMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        final int n = scanner.nextInt();
        final int[] arrays = new int[n];
        for(int i = 0 ; i < n ; i ++) arrays[i]=scanner.nextInt();
        int max = getMax(arrays);
        System.out.printf("Max element : %d in %s%n", max, Arrays.toString(arrays));
        int min = getMin(arrays);
        System.out.printf("Min element : %d in %s%n", min, Arrays.toString(arrays));
        scanner.close();
    }
    public static int getMax(int array[]) {
        int max = 0;
        for(int i = 0; i < array.length; i ++) {
            if(array[i]>max) max=array[i];
        }
        return max;
    }
    public static int getMin(int array[]) {
        int min = 9999999;
        for(int i = 0; i < array.length; i ++) {
            if(array[i]<min) min=array[i];
        }
        return min;
    }
}
