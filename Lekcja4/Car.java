public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Marka: " + make + ", Model: " + model + ", Rok produkcji: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2010);
        Car car2 = new Car("Ford", "Mustang", 2021);
        Car car3 = new Car("Honda", "Civic", 2015);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
