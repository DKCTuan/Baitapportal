/**
 * Lớp biểu diễn hình vuông (kế thừa từ Rectangle).
 */
public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
        this.side = side;
    }

    @Override
    public String getDescription() {
        return "Square[centerPoint=" + getCenterPoint() +
                ", Side=" + side + "]";
    }
}
