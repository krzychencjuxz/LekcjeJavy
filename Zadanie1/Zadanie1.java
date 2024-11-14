class Student {
    private String name;
    private int age;
    private char grade;
    private double averageGrade;

    public Student(String name, int age, char grade, double averageGrade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.averageGrade = averageGrade;
    }

    public void introduce() {
        System.out.println("Imię: " + name + ", Wiek: " + age + ", Ocena: " + grade);
    }

    public char calculateFinalGrade() {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 75) {
            return 'B';
        } else {
            return 'C';
        }
    }
}

public class Zadanie1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Krzysiek", 17, 'A', 91.5),
            new Student("Marta", 18, 'B', 78.2),
            new Student("Piotrek", 19, 'C', 65.0)
        };

        for (Student student : students) {
            student.introduce();
            char finalGrade = student.calculateFinalGrade();
            System.out.println("Końcowa ocena: " + finalGrade);
            switch (finalGrade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Good!");
                    break;
                default:
                    System.out.println("Needs improvement!");
                    break;
            }
            System.out.println("----------------------------");
        }
    }
}
