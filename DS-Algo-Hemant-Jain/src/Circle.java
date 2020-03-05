public class Circle extends Shape {
    //    *** concrete class whose instances can be created.

    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Area = πr^2
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        // Perimeter = 2πr
        return 2 * Math.PI * radius;
    }
}
