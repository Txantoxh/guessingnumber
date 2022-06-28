import java.util.Random;
import java.util.Scanner;
public class number_guess {
  
    public static void main(String[]args){
        int targetNumber;
        Scanner scan = new Scanner(System.in);
        while (true){
            Random random = new Random();
            int number = random.nextInt(7); // maximum number of random number can be upto 7
            System.out.println("********Guessing Number Game**********");
            System.out.println("Enter any number between 1 to 6");
            System.out.println("If you want to exit the game then press the number 7");
            System.out.println("Enter any number ");

            // getting an input from user.
            targetNumber = scan.nextInt();

            // if the number is 1 conditions.
            if (targetNumber==1){
                System.out.println("You choose = " + targetNumber);
                System.out.println("Computer choose = " + number);

                    if (targetNumber==number){
                        System.out.println("Congratulations you won");
                    }
            else{
                    System.out.println("I am sorry, but the computer won :( !!!");
                }
            }
                
                // second number quessing number 2 conditions.
            if (targetNumber==2){

                    System.out.println("You choose = " + targetNumber);
                    System.out.println("Computer choose = " + number);
            if (targetNumber==number)
                    {
                        System.out.println("Congratulations you won");
                    }
                   
            else {
                       System.out.println("I am sorry, but the computer won :( !!!");
                    }
                 }
                // guessing the number 3 conditions
            if (targetNumber==3)
            {
                System.out.println("You choose = " + targetNumber);
                System.out.println("Computer choose = " + number);
            if(targetNumber==number)
                    {
                    System.out.println("Congratulations you won");

                    }
                   
            else {
                       System.out.println("I am sorry, but the computer won :( !!!");
                    }
            }
            // guessing the number 4 conditions.
            if (targetNumber==4)
            {

                    System.out.println("You choose = " + targetNumber);
                    System.out.println("Computer choose = " + number);
            if(targetNumber==number)
                    {
                     System.out.println("Congratulations you won");

                    }
                   
            else {
                     System.out.println("I am sorry, but the computer won :( !!!");
                    }
         }

            // guessing the number 5 conditions.
            if (targetNumber==5)
            {

                        System.out.println("You choose = " + targetNumber);
                        System.out.println("Computer choose = " + number);
            if (targetNumber==number){

                        System.out.println("Congratulations you won");
                    }
                       
            else {
                        System.out.println("I am sorry, but the computer won :( !!!");
                        }
            }
            // quessing the number 6.
                 if (targetNumber==6)
            {

                    System.out.println("You choose = " + targetNumber);
                    System.out.println("Computer choose = " + number);
        if (targetNumber==number){

                    System.out.println("Congratulations you won");
                }
                   
        else {
                System.out.println("I am sorry, but the computer won :( !!!");
                    }
             }
        
             // if the use input 7 the game exit.
        if (targetNumber==7)
        {
            System.exit(0);
            }
          }
    
        } 
} 
  
        
       
