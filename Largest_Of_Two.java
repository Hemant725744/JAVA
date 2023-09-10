import java.util.Scanner;

public class Largest_Of_Two
{
    public static void main(String[] args) 
    {
        int a,b;
        System.out.print("Enter First Number");         //Accept first number
        Scanner s = new Scanner(System.in);             
        a = s.nextInt();
        
        System.out.print("Enter Second Number");        //Accept Second number
        b = s.nextInt();

        if(a>b)                                           //Comparing a and b
        {
            System.out.println("Largests is "+a);
        }
        else
        {
            System.out.println("Largets is "+b);
        }
        s.close();
    }
}