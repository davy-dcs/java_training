package main.java.prototype;

import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle() {}

    public Circle(String color, double x, double y) {
        super(color, x, y);
    }

    public Circle(String color, double x, double y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) this.radius = circle.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
