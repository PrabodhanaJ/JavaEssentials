package abstraction.shape;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7) ;
        System.out.println(rectangle.calculateArea());
    }
}
