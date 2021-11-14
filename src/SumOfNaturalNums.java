import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        int sum = 0;
        int fac = 1;
        System.out.println("Enter the number: ");
        Scanner sc3 = new Scanner(System.in);
        int n = sc3.nextInt();
/*
 for (int i=1; i<=n; i++)
 {
     if(i%2==0)
         sum = sum + i;
 }
*/
        for (int i=1; i<=n; i++)
        {
            fac = fac * i;
        }
//        System.out.println("Sum is " +sum);
        System.out.println("Factorial is " +fac);
    }
}
