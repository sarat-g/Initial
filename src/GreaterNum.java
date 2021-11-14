import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        if (a==b)
        {
            if (a>c)
            System.out.println("a and b are equal and greater than c");
            else if (a<c)
                System.out.println("c is greater");
        }
        else if (b==c)
        {
            if (b>a)
                System.out.println("b and c are equal and greater than a");
            else if (b<a)
                System.out.println("a is greater");
        }
        else if (c==a)
        {
            if (c>b)
                System.out.println("a and c are equal and greater than b");
            else if (c<b)
                System.out.println("b is greater");
        }
        else if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (a > b && a < c) {
            System.out.println("c is greater");
        } else {
            System.out.println("b is greater");
        }

    }
}