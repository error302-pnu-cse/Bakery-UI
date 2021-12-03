import java.util.Scanner;
class Rectangle {
    private final Point p1, p2;
    public Rectangle(Point p1, Point p2) {
        this.p1=p1;
        this.p2=p2;
        //Your code here
    }

    public void moveBy(int x, int y) {
        p1.setX(p1.getX()+x);
        p1.setY(p1.getY()+y);
        p2.setX(p2.getX()+x);
        p2.setY(p2.getY()+y);
        //Your code here
    }

    public void moveBy(int position) {
        moveBy(position,position);
        //Your code here
    }

    @Override
    public String toString() {
        return String.format("Ractangle[(%d, %d), (%d, %d)]", p1.getX(), p1.getY(), p2.getX(), p2.getY());
        //Your code here
        //return "";
    }
}
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class OverloadingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle(new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt()));
        Rectangle rectangle2 = new Rectangle(new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt()));

        rectangle1.moveBy(sc.nextInt(), sc.nextInt());
        rectangle2.moveBy(sc.nextInt());
        sc.close();

        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}