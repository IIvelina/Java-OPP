package shapes;

public class Rectangle extends Shape{
 private Double height;
 private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        //super взима от класовете, които наследяваме
        super.setPerimeter(2*(width + height));
        return super.getPerimeter();
    }

    @Override
    public Double calculateArea() {
        super.setArea(width*height);
        return super.getArea();
    }
}
