import java.util.Scanner;

public class NumInArray {
    public static void main(String[] args) {
        int arr[] = {45,23,94,32,28,77};
        //System.out.println(Greater1(arr));
        System.out.println(Greater2(arr));
    }

//    public static int Greater1(int arr[])
//    {
//        int max=arr[0];
//        for(int i=0; i<arr.length; i++)
//        {
//            for(int j=0; j<arr.length;j++)
//            if(arr[j] > arr[i]) {
//                max = arr[j];
//            }
//        }
//        return max;
//    }

    public static int Greater2(int arr[])
    {
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
