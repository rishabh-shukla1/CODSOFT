import java.util.Scanner;
public class ATMmachine
{
    
    public static void  checkbalance(int b)
    {
        System.out.println("CURRENT BALANCE-->"+b);
    }
    public static void withdrawal(int b,int w)
    {
        System.out.println("WITHDRAWAL AMAOUNT-->"+w);
        if(b>w)
        {
            b=b-w;
            System.out.println("**PLEASE COLLECT YOUR MONEY**");
            System.out.print("UPDATED-->");
            
            checkbalance(b);
            System.out.println();
        }
        else
        {
            System.out.println("INSUFFICIENT BALANACE");
            checkbalance(b);
        }
    }
    public static void deposit(int d,int b)
    {
        b=b+d;
        System.out.println("AMOUNT DEPOSITED-->"+d);
        System.out.print("UPDATED-->");
        checkbalance(b);
        System.out.println();

    }
    public static void main(String args[])
    {
        System.out.println("**WELCOME TO ATM MACHINE**");
        Scanner kb=new Scanner(System.in);
        int b=1000000000;
        int password=1234;
        System.out.println("ENTER THE FOUR DIGIT PASSWORD-->");
        int p=kb.nextInt();
        if(p==password)
        {
        System.out.println("ENTER 1 FOR BALANECE CHECK");
        System.out.println("ENTER 2 FOR MONEY WITHDRAWALS");
        System.out.println("ENTER 3 FOR MONEY DEPOSIT");
        int k=kb.nextInt();
        if(k==1)
        {
            checkbalance(b);

        }
        else if(k==2)
        {
            checkbalance(b);
            System.out.println("ENTER THE AMOUNT OF WITHDRAWAL");
            int w=kb.nextInt();
            withdrawal(b,w);
            System.out.println("**** THANK  YOU ****");
        }
        else if(k==3)
        {
            checkbalance(b);
            System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
            int d=kb.nextInt();
            deposit(d,b);
             System.out.println("**** THANK  YOU ****");

        }
        else
        {
             System.out.println("INVALID CHOICE");
        }
        }
        else
        {
            System.out.println("ENTERD WRONG PASSWORD");
            System.out.println("IF YOU WANT TO ENTER THE PASSWORD AGIN THE PRESS 1 AND 0 IF NOT");
            int f=kb.nextInt();
            if(f==1)
            {
               main(args);
            }
            else
            {
                System.out.println("**** THANK  YOU ****");
            }
        }
    

        

        
    }
}