public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        // Area = width * length
        return width * length;
    }

    @Override
    public double perimeter() {
        // Perimeter = 2(width + length)
        return 2*(width + length);
    }
}
