import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your value:");
            int x = sc.nextInt();
            if (x>0)
            {
                System.out.println("number is positive");
            }
            else if(x == 0)
            {
                System.out.println("number is zero");
            }
            else
            {
                System.out.println("number is negative");
            }
        }
    }
}
