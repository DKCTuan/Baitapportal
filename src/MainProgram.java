import java.util.ArrayList;

/**
 * Lớp chạy chương trình chính.
 */
public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 6));
        shapes.add(new Square(new Point(3, 3), 5));
        shapes.add(new Circle(new Point(0, 0), 2.5));
        shapes.add(new Rectangle(new Point(-2, 4), 3, 7));
        
        System.out.println("Tổng số hình đã khởi tạo: " + Shape.getShapeCount());

        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println("- " + s.getDescription());
        }

        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println("- " + s.getCenterPoint());
        }
    }
}