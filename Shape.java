public class Shape {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.rectDimension(10, 20);
        rect.rectArea();

        Circle cir = new Circle();
        cir.circleDimension(5);
        cir.circleArea();
    }
}
