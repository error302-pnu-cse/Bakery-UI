import java.util.ArrayList;
import java.util.Scanner;
public class SwitchMain2 {
        public static void main(String[] args) {
                final Scanner scanner = new Scanner(System.in);
                final ArrayList<String> arrays = new ArrayList<>();
                boolean check = true;
                while(check) {
                        String a = scanner.next();
                        if(a=="quit") {
                                System.out.println("Bye");
                                check=false;
                                break;
                        }
                        switch(a) {
                                case "add" :
                                        int n = scanner.nextInt();
                                        arrays.add(switchingname(n));
                                        break;
                                case "print" :
                                        System.out.println(arrays);
                                        break;
                                case "quit" :
                                        System.out.println("Bye");
                                        check=false;
                                        break;

                                default:
                                        System.out.println("Invalid Command");
                                        break;
                        }
                }
                scanner.close();
        }
        public static String switchingname(int n){
                String name="";
                switch (n) {
                        case 1: name = "January"; break;
                        case 2: name = "February"; break;
                        case 3: name = "March"; break;
                        case 4: name = "April"; break;
                        case 5: name = "May"; break;
                        case 6: name = "Jun"; break;
                        case 7: name = "July"; break;
                        case 8: name = "August"; break;
                        case 9: name = "September"; break;
                        case 10: name = "October"; break;
                        case 11: name = "November"; break;
                        case 12: name = "December"; break;
                        default: break;
                }
                final String str = name;
                return str;
        }
}

