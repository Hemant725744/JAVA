import java.util.Scanner;

public class CalculatorDemo 
{
    public static void main(String[] args) 
    {
        int a,b,ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number");
        a = s.nextInt();
        System.out.println("Enter Second number");
        b = s.nextInt();

        System.out.println("************Main Menu*************");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter Choice ");
        ch = s.nextInt();

        switch(ch)
        {
            case 1 : System.out.println("Addition is "+(a+b));
                     break;
            
            case 2 : System.out.println("Subtraction is "+(a-b));
                     break;
            case 3 : System.out.println("Multiplication is "+(a*b));
                     break;
            case 4 : System.out.println("Division is "+(a/b));
                     break;
            default : System.out.println("Invalid Choice");
                     break;
            
            
        }
        s.close();

        
    }

    
}
