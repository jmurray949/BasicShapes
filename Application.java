import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));

        System.out.println("Basic shapes:");
        for(Shape s: shapes) {
            s.draw();
        }

        System.out.println("\nDecorator Pattern - Shape with Emphasis:");
        // Demonstrate Decorator pattern with Emphasis
        Shape circle = factory.getShape("circle");
        Shape emphasizedCircle = new EmphasisDecorator(circle);
        emphasizedCircle.draw();

        System.out.println("\nAnother emphasized shape:");
        Shape triangle = factory.getShape("triangle");
        Shape emphasizedTriangle = new EmphasisDecorator(triangle);
        emphasizedTriangle.draw();

        System.out.println("\nSingleton Pattern - Square always returns same instance:");
        // Demonstrate Singleton pattern
        Shape square1 = factory.getShape("square");
        Shape square2 = factory.getShape("square");
        System.out.println("square1 == square2: " + (square1 == square2));
        square1.draw();
    }
}
