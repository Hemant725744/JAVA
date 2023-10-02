import java.lang.Math;

public class Circle {
    final float pi=3.14f;
    float radius;

    void  circleDimension(float r)
    {
        radius=r;
    }

    void circleArea()
    {
        System.out.println("Area of Circle is " + (pi*(Math.pow(radius,2))));
    }
}
