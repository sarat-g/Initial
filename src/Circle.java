import java.util.Scanner;

public class Circle {
    double x,y;
    double r;

    public Circle(){
        System.out.println("Enter the radius of the circle");
        Scanner r = new Scanner(System.in);
        double r1 = r.nextDouble();
        this.r = r1;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    double circumference() {
        return 2 * 3.14* r ;     }
    double area() {
        return  3.14* r * r ;}
}

