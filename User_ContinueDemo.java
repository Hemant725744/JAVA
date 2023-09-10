import java.util.Scanner;

public class User_ContinueDemo 
{
    public static void main(String[] args) 
    {
        int num,i,sq,cube;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total Number to enter ");
        num = s.nextInt();

        for(i=1;i<=num;i++)
        {
              
              if(i%4==0)
              continue;
              System.out.println("Number is "+(i));
              System.out.println(i+" Square is "+(i*i));
              System.out.println(i+" Cube is "+(i*i*i));
        }
        s.close();
        
    }
    
}
