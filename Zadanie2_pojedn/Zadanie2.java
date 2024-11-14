// Zadanie2.java
public class Zadanie2 {

    // Klasa Person z metodą introduce
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println("Hej, jestem " + name + " i mam " + age + " lat.");
        }
    }

    // Klasa Book z metodą displayDetails
    static class Book {
        private String title;
        private String author;
        private int yearPublished;

        public Book(String title, String author, int yearPublished) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        public void displayDetails() {
            System.out.println("Tytuł: " + title + ", Autor: " + author + ", Rok wydania: " + yearPublished);
        }
    }

    // Klasa Car do przechowywania informacji o samochodzie
    static class Car {
        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void displayCarInfo() {
            System.out.println("Samochód: " + make + " " + model + ", Rok produkcji: " + year);
        }
    }

    public static void main(String[] args) {
        // Tworzenie obiektów Person i wywołanie introduce
        Person person1 = new Person("Jan", 25);
        person1.introduce();

        // Tworzenie obiektów Book i wywołanie displayDetails
        Book book1 = new Book("Wiedźmin", "Andrzej Sapkowski", 1994);
        book1.displayDetails();

        // Tworzenie obiektów Car i wywołanie displayCarInfo
        Car car1 = new Car("BMW", "M3", 2020);
        car1.displayCarInfo();
    }
}
