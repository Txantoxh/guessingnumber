import java.util.Random;
import java.util.Scanner;
public class number_guess {
  
    public static void main(String[]args){
        int targetNumber;
        Scanner scan = new Scanner(System.in);
        while (true){
            Random random = new Random();
            int number = random.nextInt(7);
            System.out.println("********Guessing Number Game**********");
            System.out.println("Enter any number between 1 to 6");
            System.out.println("If you want to exit the game then press the number 7");
            System.out.println("Enter any number = ");
            targetNumber = scan.nextInt();
            if (targetNumber==1){
                System.out.println("You choose= " + number);
                if (targetNumber==number){
                    System.out.println("Congratualtion you won");
                }
                else{
                    System.out.println("I am sorry, but the computer won :( !!!");
                }
                
            }
        }


    }
}