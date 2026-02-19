public class EmphasisDecorator extends Shape {
    private Shape decoratedShape;

    public EmphasisDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        System.out.println("***");
        decoratedShape.draw();
        System.out.println("***");
    }
}
