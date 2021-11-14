import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        int arr[] = {45,23,78,32,28,97};
        System.out.println("Select a number from 0 to 100: ");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();
        //System.out.println(contains(arr,selection));
        int index = index(arr,selection);
        if(index == -1)
            System.out.println("your number is not present in the array");
        else
            System.out.println("Your number is at index "+index);
    }
public static boolean contains(int arr [], int num){
        for(int i=0; i<arr.length; i++)
        {
            if(num == arr[i])
            {
                return true;
            }
        }
        return false;
}
public static int index(int arr[], int num)
{
    for(int i=0; i<arr.length; i++)
    {
        if(num == arr[i])
        {
            return i;
        }
    }
    return -1;
}
}
