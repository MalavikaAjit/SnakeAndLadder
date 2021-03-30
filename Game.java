import java.util.Random;
public class Game {
       
    public static final int InitialPosition = 0;
    public static final int FinalPosition = 100;
    public static int count=0;

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
        int position= 0;
        while (position < FinalPosition) {
           int diceNumber = RollADie();
           System.out.println("dice number is " + diceNumber);
           int choice = gameOption();
           switch(choice) {
             case 0:
               System.out.println("No play; player stays " );
               position = position;
               break;
             case 1:
               System.out.println("ladder; the player moves ahead ");
               if(position - diceNumber < FinalPosition){
                   position = position + diceNumber;
               }
               break; 
             case 2:
               System.out.println("Snake; the player moves backward " );
                   position = position - diceNumber;
                   if(position < InitialPosition) {
                   position = InitialPosition;
               }
               break;
           }
            count++;
            System.out.println("dice count is " + count);
            System.out.println("current position" +position);
        }   
   }
     
}



           
       
    


            