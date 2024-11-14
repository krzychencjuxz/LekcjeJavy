import java.util.ArrayList;
import java.util.List;

public class Zadanie8 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Jan Kowalski");
        students.add("Anna Nowak");
        students.add("Piotr Zieliński");
        students.add("Kasia Wiśniewska");
        students.add("Zofia Lewandowska");

        printList(students);
        removeStudentByIndex(students, 2);
        printList(students);

        students.add("Michał Wójcik");
        students.add("Agnieszka Majewska");
        printList(students);
    }

    public static void printList(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void removeStudentByIndex(List<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
