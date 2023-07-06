import java.util.Scanner;
import java.util.Random;
public class NUMBERGAME
{    
    public static void main(String args[])
        {
             Random random= new Random();
            int r=random.nextInt(10);
            System.out.println("--------WELCONE TO NUMBER GAME----- ");
            System.out.println("YOU WILL GET THREE CHANCE TO  GUESS THE NUMBER -:");
            System.out.println("YOU CAN GUESS THE NUMBER BETWEEN 1 TO 10 --:");
            System.out.println("Best of luck -:");
            int d=0;
            for(int i=0;i<3;i++)
            {
                System.out.println("ENTER THE NUMBER OF YOUR CHOICE-:");
                Scanner kb=new Scanner(System.in);
                int x=kb.nextInt();
                if(x==r)
                {
                    d++;
                    System.out.println("CONGRATS  VICTORY ");
                    System.out.println("NUMBER OF GUESS TAKEN OUT OF 3 ARE-: "+(i+1));
                    break;
                }
                else if(x>r)
                {
                    System.out.println("THE NUMBER ENTERED IS LARGER THAN THE RANDOM NUMBER");
                }
                else
                System.out.println("THE NUMBER ENTERED IS SMALLER THAN THE RANDOM NUMBER");
                
                

            }
            
            if(d!=1)
            {
                System.out.println("YOU LOST THIS GAME");
                System.out.println("RANDOM NUMBER IS -:"+r);
            }
                System.out.println("IF YOU WANT TO PLAY THE GAME AGAIN THEN PRESS 1 AND PRESS 0 BUTTON IF NOT ");
                Scanner kb=new Scanner(System.in);
                int c=kb.nextInt();
                if(c==1)
                {
            
                main(args);
                }
                else
                {
                  
                System.out.println("***THANKS FOR PLAYING THE GAME***");
                System.out.println("****HAVE A NICE DAY SIR*****");
                
                }

        }
}