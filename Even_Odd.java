import java.util.Scanner;

public class Even_Odd 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        a = s.nextInt();

        if (a%2==0)                                                //Condition for even
        {
            System.out.println("Number is Even = "+a);
        }

        else                                                       //If Condition is False the excecute this
        {
            System.out.println("Number is Odd = "+a);
        }
        s.close();
    }
    
}
