import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc2 = new Scanner(System.in);
                float num = sc2.nextFloat();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else if (num % 2 == 1) {
            System.out.println("NUmber is odd");
        } else {
            System.out.println("Not an whole number");
        }
    }
}
