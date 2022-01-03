import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        System.out.println("Guess a number between 0 and 100.");
        int guess = scan.nextInt();
        while (guess != number){
            if (guess < number){
                System.out.println("Too low!");
            }
            else {
                System.out.println("Too high!");
            }
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
    }
}
