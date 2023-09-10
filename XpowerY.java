import java.util.Scanner;

public class XpowerY 
{
    public static void main(String[] args) 
    {
        int x,y,i,ans=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Base");
        x = s.nextInt();
        System.out.print("Enter the Power");
        y = s.nextInt();
        for (i=1;i<=y;i++)
        {
            ans = ans*x;
        }
        System.out.println("Answer "+ans);
        s.close();
        
    }
    
}
