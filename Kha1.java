import java.util.ArrayList;
interface Drawable {
    void draw();
}

abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public void displayInfo() {
        System.out.println("Ten hinh: " + this.name);
    }
}

class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public void draw() {
        System.out.println("Ve hinh chu nhat kich thuoc: " + width + "x" + height);
    }
}

class Circle extends Shape implements Drawable {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void draw() {
        System.out.println("Ve hinh tron ban kinh: " + radius);
    }
}

public class Kha1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("Hinh Chu Nhat A", 5.0, 3.0);
        shapes[1] = new Circle("Hinh Tron Nho", 2.5);
        shapes[2] = new Rectangle("Hinh Chu Nhat B", 10.0, 10.0);
        System.out.println("--- HE THONG QUAN LY HINH HOC ---");
        for (Shape s : shapes) {
            System.out.println("-------------------------");
            s.displayInfo();
            System.out.printf("Dien tich: %.2f\n", s.getArea());
            System.out.printf("Chu vi: %.2f\n", s.getPerimeter());
            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }
        }
    }
}