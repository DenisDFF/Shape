
public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Semicircle semicircle = new Semicircle();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(square);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(semicircle);
    }
}

