import java.util.Scanner;
public class User_BreakDemo 
{
    public static void main(String[] args) 
    {
        int i,num;
        Scanner s = new Scanner(System.in);

        for(i=1;i<=100;i++)
        {
            System.out.print("Enter a Number");
            num = s.nextInt();
            if(num==0)
            break;
        }
        s.close();

        
    }
    
}
