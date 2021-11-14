import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        int guess;
        System.out.println("Enter you guess between 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        do {
            guess = sc.nextInt();
            if (guess > random)
                System.out.println("Your number is higher. Try Again.");
            else if(guess<random)
                System.out.println("Your number is lower. Try Again.");
            } while (guess != random);
        System.out.println("You win, congratulations");
        }
}
