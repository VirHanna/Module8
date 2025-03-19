// Class for a square
class Square extends Shape {
    private final double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
