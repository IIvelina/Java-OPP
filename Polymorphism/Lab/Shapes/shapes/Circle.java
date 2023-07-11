package shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    public final Double getRadius() {
        return radius;
    }

    protected void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI*radius*radius;
    }
}
