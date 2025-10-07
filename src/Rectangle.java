/**
 * Lớp biểu diễn hình chữ nhật.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centerPoint, double width, double height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getDescription() {
        return "Rectangle[centerPoint=" + centerPoint +
                ", Width= " + width +
                ", Height=" + height + "]";
    }
}
