// Class for an ellipse
class Ellipse extends Shape {
    private final double majorAxis;
    private final double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an ellipse with major axis " + majorAxis + " and minor axis " + minorAxis);
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
