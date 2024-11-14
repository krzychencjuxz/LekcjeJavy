public class Zadanie7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        printArray(numbers);
        System.out.println("Sum: " + calculateSum(numbers));

        numbers[1] = 10;
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
