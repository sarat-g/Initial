import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        double sum = 0;
        double deciarray[]= new double[10];
        for(int i=0;i<10;i++) {
            System.out.println("Enter the decimal no " + (i+1));
            Scanner sca = new Scanner(System.in);
            deciarray[i] = sca.nextDouble();
        }
        for(int i=0;i<10;i++) {
                sum = sum + deciarray[i];
        }
        System.out.println("Sum of the decimal in the array is "+sum);

        System.out.println("Enter the number of characters that are in your name: ");
        Scanner sca = new Scanner(System.in);
        int lengthname = sca.nextInt();
        char name[] = new char[lengthname];
        for(int i=0; i<lengthname; i++)
        {

        }
                
    }
}
