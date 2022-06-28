import java.util.Scanner;
public class number_guess {
    
    public static void main(String[]args){
        //int targetNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int targetNumber = (int) (Math.random()*100);
        int x = scan.nextInt();
        if(x==1 || x==3 || x==4){
            System.out.println("you Guessed the right number");
        }
        else{
            System.out.println("you enter the wrong number");
        }

    }
}