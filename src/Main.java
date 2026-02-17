import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to my game! ");

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Would you like to play? (y/n) ");
            char play = scan.next().charAt(0);
            if (play == 'y') {
                validInput = true;
                System.out.print("Loading: ");
                for (int i = 0; i < 25; i++) {
                    System.out.print(">");
                    Thread.sleep(50);
                }
            } else if (play == 'n') {
                System.out.println("See you another time!");
                validInput = true;
            } else {
                System.out.println("Error: invalid input! try y/n");
                validInput = false;
            }
        }
    }
}

