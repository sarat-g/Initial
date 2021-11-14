public class TwoNumbers {
    public static void main(String[] args) {

        String Name = Fullname("First", "last");
        short x=300,y=178;
        int subtraction=sub(x,y);
        int multiplication=multi(x,y);
        double division=div(x,y);
        System.out.println(Name);
        System.out.println(sum(x,y));
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
public static int sum(short a, short b){
        int sum=a+b;
        return sum;
        }
        public static int sub(int a, int b){
        int sub=a-b;
        return sub;
        }
        public static int multi(int a, int b){
        int multi=a*b;
        return multi;
        }
        public static double div(int a, int b){
        double div=a/b;
        return div;
        }


        public static String Fullname(String firstName, String lastName){
        return firstName +" "+ lastName;
                }
}
