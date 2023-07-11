package shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.1);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Shape rectangle = new Rectangle(3.2, 5.5);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
    }
}
