import java.util.Scanner;
enum Shape {TRIANGLE, RECTANGLE, CIRCLE} ;
public class AreaCalculator {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println();
        while(check) {
            String b = scanner.next();
            String a = b.toUpperCase();
            Float height, length, radius;
            if(a=="Quit") {
                System.out.println("Bye");
                check=false;
                break;
            }
            switch(a) {
                case "TRIANGLE" :
                    height=scanner.nextFloat();
                    length=scanner.nextFloat();
                    System.out.printf("Area of Triangle: %.2f\n", height*length/2);
                    break;
                case "RECTANGLE" :
                    height=scanner.nextFloat();
                    length=scanner.nextFloat();
                    System.out.printf("Area of Rectangle: %.2f\n", height*length);
                    break;
                case "CIRCLE" :
                    radius=scanner.nextFloat();
                    System.out.printf("Area of Cricle: %.2f\n", radius*radius*Math.PI);
                    break;
                case "QUIT" :
                    System.out.println("BYE");
                    check=false;
                    break;
                default:
                    System.out.println("INVALID");
                    break;
            }
        }
        scanner.close();
    }
}

