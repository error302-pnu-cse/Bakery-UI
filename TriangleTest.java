import java.util.Scanner;
public class TriangleTest {
    public static class Triangle {
        final private int base, height;
        public Triangle(int base, int height) {
            this.base=base;
            this.height=height;
        }
        public Double getArea(double base1, double height1) {
            double area = base1*height1/2;
            return area;
        }
        public void toString(double area) {
            System.out.printf("Triangle [base=%d, height=%d, area=%.2f]%n", base, height, area);
        }
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        Triangle[] newTriangle = new Triangle[n];
        for(int i = 0 ; i < n ; i ++) {
            final int base = scanner.nextInt(), height = scanner.nextInt();
            newTriangle[i] = new Triangle(base, height);
            double area = newTriangle[i].getArea(base, height);
            newTriangle[i].toString(area);
        }
        scanner.close();
    }
}