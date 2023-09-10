import java.util.Scanner;

public class TableDemo 
{
    public static void main(String[] args) 
    {
        int i,num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = s.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d",num,i,num*i);
            System.out.println();
        }
        s.close();
    }
    
}
