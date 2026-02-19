public class ShapeFactory {
    public Shape getShape(String id) {
        switch(id.toLowerCase()) {
            case "square": return new Square();
            case "circle": return new Circle();
            case "triangle": return new Triangle();
            default: return null;
        }
    }
}
