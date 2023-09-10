import java.util.Scanner;

public class CircleDemo
{
    public static void main(String[] args) 
    {
        float r,area;
        final float pi=3.14f;                   //Set value of pie Constant
        Scanner s = new Scanner(System.in);     //Accepting the Radius from user
        System.out.print("Enter radius");
        r=s.nextFloat();
        area = pi*r*r;                          //Calcualting Area
        System.out.print("Area ="+area);
        s.close();

    }
}