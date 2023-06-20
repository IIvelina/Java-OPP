package Lab.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    // int xBottomLeft;
    //  int yBottomLeft;

    private Point topRight;
    //  int xTopRight;
    //  int yTopRight;


    public Rectangle(Point bottomLeft, Point bottomRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = bottomRight;
    }

    public boolean contains(Point point){
        boolean containsOnX = false;
        if (point.getX() >= bottomLeft.getX() &&
        point.getX() <= topRight.getX()){
            containsOnX = true;
        }
        boolean containsOnY = false;
        if (point.getY() >= bottomLeft.getY() &&
        point.getY() <= topRight.getY()){
            containsOnY = true;
        }

        boolean isInRectangle = containsOnX && containsOnY;

        return isInRectangle;
    }
}
