import java.util.*;
public class WORDCOUNTER
{
    public static void main(String args[])
    {
         System.out.println("*****WORD COUNTER*****");
        System.out.println("ENTER THE TEXT BELOW --->");
        Scanner kb=new Scanner(System.in);

        String s=kb.nextLine();
        String w="";
        int words=0;
        
        if(s!="")  // if the users enters a empty string 
        {
        char r=s.charAt(s.length()-1);
        if(!(r=='.'||r==';'||r==','||r=='?'||r=='!'||r==':'||r==' ')) 
        {
            s=s+' ';
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             if(ch=='!'||ch==' '||ch==';'||ch==','||ch=='.'||ch=='?'||ch==':')
             words++;

        }
        System.out.println("TOTAL NUMBER OF WORDS IN THE TEXT ARE-->"+words);
        System.out.println("----------");
        
        
        //till here we have counted the number of words
       int g=0;
        String a[]=new String[words];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='!'||ch==' '||ch==';'||ch==','||ch=='.'||ch==':'||ch=='?')
            {
                a[g]=w;
                g++;
                
                w="";
            }
            else
            {
                w=w+ch;
                
            }
        }
        //till here i have converted the string into array
        System.out.println("****FREQUENCY OF EACH WORD****");
        int unique=0;
        for(int i=0;i<a.length;i++)
        {
            int d=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].equals(a[j]))
                {
                d++;
                a[j]="";
                }
                

            }
            if(a[i]!="")
            
            System.out.println(a[i]+"="+d);
            if(d==1&&a[i]!="")
            unique++;

            
        }// till here i have counted the frequency and number of unique words
        System.out.println("------------");
        System.out.println("TOTAL NUMBER OF UNIQUE WORDS-->"+unique);
        System.out.println("----------*****------");
        }
        else
        {
            System.out.println("TEXT IS EMPTY");
        }

       
    }
}