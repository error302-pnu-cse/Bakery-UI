import java.util.Locale;
import java.util.Scanner;
    public class StringCompareMain {
        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);
            final String a=scanner.nextLine();
            final String b=scanner.nextLine();
            System.out.println(a.equals(b));
            System.out.println(a.equalsIgnoreCase(b));
            String sb=b.toLowerCase();
            System.out.println(a.equals(sb));
            String sa=a.replace("easy","fun");
            if(a.indexOf("easy")>0) System.out.println(sa.equalsIgnoreCase(sb));
            else System.out.println(a.equalsIgnoreCase(sb));
            scanner.close();
    }
    }
