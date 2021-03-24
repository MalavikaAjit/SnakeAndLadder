import java.util.Random;
public class Game {
       
    public static int RollADie() {
        Random random = new Random();
        int number = random.nextInt(6)+1;
        return number;
    }
    public static void main(String[] args) {
         System.out.println(" welcome to snake and ladder game  ");	
         int position =0;
         System.out.println("Initial position" +position);
         int diceNumber = RollADie();
         System.out.println("dice number is " + diceNumber);  
    
    }
}







            
