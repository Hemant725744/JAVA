public class Rect {
    int height;
    int width;

    void  rectDimension(int h,int w)
    {
        height = h;
        width = w;
    }

    void rectArea()
    {
        System.out.println("Area of rectangle is " + (height*width));
    }
}
