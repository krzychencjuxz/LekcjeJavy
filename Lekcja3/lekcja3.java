package Lekcja3;

public class Lekcja3 {
    public static void main(String[] args) {
        // Zadanie 3.1: Sprawdzenie, czy liczba jest dodatnia, ujemna czy zerowa
        int number = -5;
        if (number > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Liczba to zero");
        }

        System.out.println("----");

        // Zadanie 3.2: Pierwsze 10 liczb ciągu Fibonacciego
        int n1 = 0, n2 = 1;
        System.out.print("Ciąg Fibonacciego: " + n1 + " " + n2);
        for (int i = 2; i < 10; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        System.out.println("----");

        // Zadanie 3.3: Pętla wypisująca liczby od 1 do 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
