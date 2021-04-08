public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle(double r) {
        this.radius =r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius;
    }
}
