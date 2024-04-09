
import java.util.Random;
import java.util.Scanner;

public class  Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chances=5;
        int finalscore=0;
        boolean playAgain=true;
        System.out.println("...Welcome to the Game!...");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");  
        System.out.println("You have "+chances+" chances to guess");
        
        while(playAgain)
        {
        int rand=getrandN(1,100);
        boolean guess=false;
        for(int i=1;i<=chances;i++)
        {
        System.out.println("Chance "+i+" Enter your guess");
        int num=scanner.nextInt();
        if(num==rand)
        {
            guess=true;
            System.out.println("You guessed the correct number!");
            finalscore+=100;
            System.out.println("Your final score is:"+finalscore);
            System.out.println("...Hope you enjoyed the Game!...");
            break;
        }
        else if(num>=rand)
        {
            System.out.println("Too high than my number");
        }
        else
        {
            System.out.println("Too low than my number");
        }
        }
       if(guess==false)
       {
        System.out.println("Sorry! You lost the game.The number is: "+rand);
       }
       System.out.println("Do you want to play again(yes/no)");
       String s=scanner.next();
       playAgain=s.equalsIgnoreCase("yes");
        System.out.println("Thank you for playing");
       
    }
    }
         public static int getrandN(int min,int max)
         {
            return (int)(Math.random()*(max-min+1)+min);
         }

}

