import java.util.Random;


public class Game{


    public static final int InitialPosition = 0;
    public static final int FinalPosition = 100;

    public static int RollADie() {
        Random random = new Random();
        int number = random.nextInt(6)+1;
        System.out.println("dice number is " + number);
        return number;
    }

    public static int gameOption() {
        Random random = new Random();
        int option= random.nextInt(3);
        System.out.println("option is: " + option);
        return option;
    }

    public static void PrintMsg (String msg) {
        System.out.println(msg);
    }

    private static final boolean sixesThrowAgain = true;

    public static int calPosition( int position , int name) {
        int square2 = position;
        while (true) {
            int roll = RollADie();
            System.out.printf("Player %d, on square %d, rolls a %d ", name, square2, roll);
            if (square2 + roll > 100) {
                System.out.println(" but cannot move.");
            } else {


                if (square2 == 100) return 100;
                Integer SnL = gameOption();
                Integer next = 0;
                next = square2;


                switch(SnL) {
                    case 0:

                        break;
                    case 1:
                        System.out.printf("Yay! Landed on a ladder. Climb up to %d.\n", square2);
                        square2 +=  roll;
                        if (next == 100) return 100;

                        break;
                    case 2:
                        System.out.printf("Oops! Landed on a snake. Slither down to %d.\n", square2);
                        square2 -= roll;
                        square2 = next;

                        break;
                }


            }
            if (roll < 6 || !sixesThrowAgain) return square2;
            System.out.println("Rolled a 6 so roll again.");
        }
    }


    public static void main(String[] args) {
        //System.out.println(" welcome to snake and ladder game  ");
        // String message = " welcome to snake and ladder game  ";
        PrintMsg(" welcome to snake and ladder game  ");

        int[] players = {1, 1};

        while (true) {
            for (int i = 0; i < players.length; ++i) {
                int ns = calPosition(players[i], i + 1);
                if (ns == 100) {
                    System.out.printf("Player %d wins!\n", i + 1);
                    return;
                }
                players[i] = ns;
                System.out.println();
            }
        }

    }

}