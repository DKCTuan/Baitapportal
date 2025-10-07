/**
 * Lớp biểu diễn hình tròn.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return "Circle[centerPoint=" + centerPoint +
                ", Radius=: " + radius + "]";
    }
}
