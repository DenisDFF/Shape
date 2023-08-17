
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Semicircle semicircle = new Semicircle();
        ShapePrinter.printShapeName(circle);
        ShapePrinter.printShapeName(square);
        ShapePrinter.printShapeName(triangle);
        ShapePrinter.printShapeName(rectangle);
        ShapePrinter.printShapeName(semicircle);
    }
}

