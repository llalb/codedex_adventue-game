import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to my game! ");
        System.out.print("Would you like to play? (y/n) ");

        boolean validInput = false;
        boolean wantsToPlay = false;
        int i = 0;
        while (!validInput) {
            if (i == 1) {
                System.out.print("Invalid Input! Try (y/n) ");
            }
            if (i == 2) {
                System.out.println("Restart game to try again.");
                break;
                
            }
            char play = scan.next().charAt(0);
            if (play == 'y') {
            validInput = true;
                wantsToPlay = true;
                System.out.print("Loading: ");
                for (int j = 0; j < 25; j++) {
                    System.out.print(">");
                    Thread.sleep(50);
                }
            } else if (play == 'n') {
                System.out.println("See you another time!");
                validInput = true;
            } else {
                i++;
            }            
        }

        //game animation
        if (wantsToPlay) {
            System.out.println("\nLoading complete! Starting game...");
        
            String[] castle = {
                "The Adventure Game! \n",
                "                                  |>>>",
                "                                  |",
                "                    |>>>      _  _|_  _         |>>>",
                "                    |        |;| |;| |;|        |",
                "                _  _|_  _    \\\\.    .  /    _  _|_  _",
                "               |;|_|;|_|;|    \\\\:. ,  /    |;|_|;|_|;|",
                "               \\\\..      /    ||;   . |    \\\\.    .  /",
                "                \\\\.  ,  /     ||:  .  |     \\\\:  .  /",
                "                 ||:   |_   _ ||_ . _ | _   _||:   |",
                "                 ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |",
                "                 ||:   ||.    .     .      . ||:  .|",
                "                 ||: . || .     . .   .  ,   ||:   |       \\,/",
                "                 ||:   ||:  ,  _______   .   ||: , |            /`\\",
                "                 ||:   || .   /+++++++\\    . ||:   |",
                "                 ||:   ||.    |+++++++| .    ||: . |",
                "              __ ||: . ||: ,  |+++++++|.  . _||_   |",
                "     ____--`~    '--~~__|.    |+++++__|----~    ~`---,              ___",
                "-~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~~",
                "                         THE ADVENTURE BEGINS!                                 "
            };

            for (String line : castle) {
                System.out.println(line);
                Thread.sleep(100);  // Adjust speed (100ms per line)
            }
        }

        scan.close();
    }
}

