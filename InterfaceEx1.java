interface Shape {
    double getArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
class InterfaceEx1 {
    // Usage
    public static void main(String[] args) {


        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());

    }
}