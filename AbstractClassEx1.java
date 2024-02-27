abstract class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

     public abstract void start();

    public void accelerate() {
        System.out.println("Vehicle is accelerating!");
    }
}

class Car extends Vehicle {
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    public void start() {
        System.out.println("Car starting the engine!");
    }
}

class Bike extends Vehicle {
    public Bike(String model, int year) {
        super(model, year);
    }

    @Override
    public void start() {
        System.out.println("Bike starting the pedals!");
    }
}

class AbstractClassEx1 {
    public static void main(String[] args) {


        Car car = new Car("Tesla Model S", 2023);
        Bike bike = new Bike("Trek Marlin 7", 2022);

        car.start();
        car.accelerate();

        bike.start();
        bike.accelerate();
    }
}