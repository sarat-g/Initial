import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for(int i=0;i<=2;i++)
        {
            Scanner sc = new Scanner(System.in);

            System.out.println(i+ " " +arr[i]);
        }
        System.out.println();

        String arr1[] = new String[3];
        for(int i=0;i<=2;i++)
        {
            System.out.println(i+ " " +arr1[i]);
        }
    }
}
