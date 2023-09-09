import java.util.Scanner;

public class CircleDemo
{
    public static void main(String[] args) 
    {
        float r,area;
        final float pi=3.14f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius");
        r=s.nextFloat();
        area = pi*r*r;
        System.out.print("Area ="+area);
        s.close();

    }
}