package Lekcja2;

public class Lekcja2 {
    public static void main(String[] args) {
        // Zadanie 2.1: Suma i iloczyn dwóch liczb
        int a = 5;
        int b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Suma: " + sum + ", Iloczyn: " + product);

        System.out.println("----");

        // Zadanie 2.2: Porównanie dwóch liczb
        if (a == b) {
            System.out.println("Liczby są równe");
        } else {
            System.out.println("Liczby są różne");
        }

        System.out.println("----");

        // Zadanie 2.3: Sprawdzenie, czy liczba jest parzysta czy nieparzysta
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("Liczba " + number + " jest parzysta");
        } else {
            System.out.println("Liczba " + number + " jest nieparzysta");
        }
    }
}
