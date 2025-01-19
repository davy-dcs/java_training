package prototype;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    protected String color;
    protected double x, y;

    public Shape(){}

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.color = shape.color;
            this.x = shape.x;
            this.y = shape.y;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(x, shape.x) == 0 && Double.compare(y, shape.y) == 0 && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, x, y);
    }

    @Override
    public Shape clone() {
        try {
            Shape clone = (Shape) super.clone();
            clone.color = this.color;
            clone.x = this.x;
            clone.y = this.y;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
