public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(6, 8);
        Triangle triangle = new Triangle(3, 4);
        Ellipse ellipse = new Ellipse(7, 5);

        ShapePrinter printer = new ShapePrinter();

        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);

        circle.draw();
        square.draw();
        rectangle.draw();
        triangle.draw();
        ellipse.draw();

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Ellipse area: " + ellipse.getArea());
    }
}
