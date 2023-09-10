import java.util.Scanner;
public class PrimeDemo 
{
    public static void main(String[] args)
    {
        int num,i,flag=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number to cheak ");
        num = s.nextInt();

        for (i=2;i<num;i++)
        {
            if (num%i==0)
            {
                flag++;
            }
        }
        if (flag==1)
        {
            System.out.println("Prime Number ");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
        s.close();
    }
    
}
