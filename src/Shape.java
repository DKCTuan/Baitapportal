/**
 * Lớp trừu tượng biểu diễn hình cơ bản có tâm điểm.
 */
public abstract class Shape {
    protected  Point centerPoint;
    private static int count = 0;

    public Shape(Point centerPoint){
        this.centerPoint = centerPoint;
        count ++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public static int getShapeCount() {
        return count;
    }

    public abstract String getDescription();
}
