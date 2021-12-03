import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopyMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int cnt = scanner.nextInt();
        final int[] original = new int[cnt];
        for(int i=0; i<cnt; i++) {
            int a = scanner.nextInt();
            original[i]=a;
        }
        int[] shallow = new int[cnt];
        shallow = original;
        int[] deep = new int [cnt];
        System.arraycopy(original,0,deep,0,cnt);

        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(shallow));

        modifyArray(deep, 1);
        System.out.println("Deep Copy: " + Arrays.toString(deep));

        scanner.close();
    }

    private static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}
