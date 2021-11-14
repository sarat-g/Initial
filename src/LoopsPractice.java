import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print(num);
        System.out.println("");
        PrintEven(num);
        System.out.println("");
        Sum(num);
        SumEven(num);
        FactorialFor(num);
        FactorialWhile(num);
        Fibonacci(num);
    }

    public static void Print(int a) {
        int i = 0;
        System.out.print("Printing Numbers: ");
        while (i <= a) {
            System.out.print(" "+i);
            i++;
        }
    }

    public static void PrintEven(int a) {
        int i = 0;
        System.out.print("Printing Even Numbers: ");
        while (i <= a) {
            if (i % 2 == 0) {
                System.out.print(" "+i);
            }
            i++;
        }
    }

    public static void Sum(int a) {
        int i = 0;
        int sum = 0;
        while (i <= a) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of the numbers: " + sum);
    }

    public static void SumEven(int a) {
        int i = 0;
        int sum = 0;
        while (i <= a) {
            if (i % 2 == 0)
                sum = sum + i;
            i++;
        }
        System.out.println("Sum of the Even numbers: " +sum);
    }

    public static void FactorialFor(int a) {
        int i;
        int fac = 1;
        for (i = 1; i <= a; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial: " + fac);
    }

    public static void FactorialWhile(int a) {
        int i = 1;
        int fac = 1;
        while (i <= a) {
            fac = fac * i;
            i++;
        }
        System.out.println("Factorial again: " + fac);
    }

    public static void Fibonacci(int a){
        int x1 = 0;
        int x2 = 1;
        int x3;
        int i = 3;
        System.out.print("Fibonacci series: ");
        System.out.print(+x1);
        System.out.print(" " +x2);
        while(i<=a)
        {
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            System.out.print(" "+x3);
            i++;
        }
    }
}
