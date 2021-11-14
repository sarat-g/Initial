import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MonthCheck {
    public static void main(String[] args)

//    {
//        int month = 6;
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println("It has 31 days");
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("It has 30 days");
//        } else if (month == 2) {
//            System.out.println("It has 28 days");
//        } else {
//            System.out.println("Invalid month number");
//        }
//    }


//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the month: ");
//        String month = sc.nextLine();
//        if (month.equalsIgnoreCase("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December"))
//        {
//            System.out.println("has 31 days");
//        }
//        else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November"))
//        {
//            System.out.println("has 30 days");
//        }
//        else if (month.equals("February"))
//        {
//            System.out.println("Enter the year: ");
//            Scanner sc1 = new Scanner(System.in);
//            int year = sc1.nextInt();
//            if (((year%4 == 0) && (year%100 == 0)) || (year%400 == 0))
//            System.out.println("has 29 days");
//            else System.out.println("has 28 days");
//        }
//        else{
//            System.out.println("Invalid response");
//        }
//    }


    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = sc.nextLine();
        switch(month){
        case "january":

        case "march":

        case "may":

        case "july":

        case "august":

        case "october":

        case "december":
            System.out.println("has 31 days");
            break;

        case "february":
        {
            System.out.println("Enter the year: ");
            Scanner sc1 = new Scanner(System.in);
            int year = sc1.nextInt();
            if (((year%4 == 0) && (year%100 == 0)) || (year%400 == 0))
                System.out.println("has 29 days");
            else System.out.println("has 28 days");
        }
        break;

        case "april":

        case "june":

        case "september":

        case "november":
            System.out.println("has 30 days");
            break;

        default:
            System.out.println("Invalid Response");
        }
    }
}






