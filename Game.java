import java.util.Random;
public class Game {
       
    public static int position=0;
    public static int RollADie() {
        Random random = new Random();
        int number = random.nextInt(6)+1;
        return number;
    }
    public static int gameOption() {
        Random random = new Random();
         int option= random.nextInt(3);
         return option;
    }
    public static void main(String[] args) {
         System.out.println(" welcome to snake and ladder game  ");	
         int diceNumber = RollADie();
         System.out.println("dice number is " + diceNumber);  
         int choice = gameOption();
         switch(choice) {
            case 0:
              System.out.println("No play; the player stays in the same position " );
              position = position;
              break;
            case 1:
              System.out.println("ladder; the player moves ahead by the number of position received in the die ");
              position = position + diceNumber;
              break; 
            case 2:
              System.out.println("Snake; the player moves backward by the number of position received in the die " );
              position = position - diceNumber ;
              break;
         }
         System.out.println("current position" +position);
    }
}







            