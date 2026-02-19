public class Square extends Shape {
    private static Square instance;

    private Square() {
        // Private constructor to prevent instantiation
    }

    public static Square getInstance() {
        if (instance == null) {
            instance = new Square();
        }
        return instance;
    }

    @Override
    public void draw() { System.out.println("Square"); }
}
