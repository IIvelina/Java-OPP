package ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        //this.length = length;
        setLength(length);
        //this.width = width;
        setWidth(width);
        //this.height = height;
        setHeight(height);
    }

    private void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea(){
        return 2 * this.length * this.width +
                2 * this.length * this.height +
                2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * this.length * this.height +
                2 * this.width * this.height;
    }

    public double calculateVolume(){
        return this.height * this.length * this.width;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f\n" +
                "Lateral Surface Area - %.2f\n" +
                "Volume – %.2f\n",
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }
}
