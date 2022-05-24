package AccessJava;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    void dislay() {
        System.out.println("Name : " + name + " , " + "Engine : " + engine);
    }


    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");

        System.out.println(Car.numberOfCar);
        car1.dislay();
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCar);
        car2.dislay();
    }
}
