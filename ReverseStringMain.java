import java.util.Scanner;
import java.util.Arrays;
public class ReverseStringMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        char[] cha = str.toCharArray();
        for(int i = 0; i < str.length(); i ++) System.out.print(cha[str.length() - i - 1]);
        System.out.println();
        scanner.close();
    }
}
