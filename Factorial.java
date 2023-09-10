import java.util.Scanner;

public class Factorial 
{
    
    public static void main(String[] args) 
    {
        int  i,num,fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        num = s.nextInt();

        for (i=1;i<=num;i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial is "+fact);
        s.close();
    }
    
}
