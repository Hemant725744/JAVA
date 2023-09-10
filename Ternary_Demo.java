import java.util.Scanner;
public class Ternary_Demo 
{
    public static void main(String[] args) 
    {
        int a,b,c,max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number ");
        a = s.nextInt();
        System.out.println("Enter Second Number ");
        b = s.nextInt();
        System.out.println("Enter Third Number ");
        c= s.nextInt();

        max = (a>b && b>c)?a:(b>c)?b:c;
        System.out.println("Largest Number is = "+max);

        s.close();

    } 

    
}
