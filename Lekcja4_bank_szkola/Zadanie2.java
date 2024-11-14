class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    protected double calculateAverageGrade() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return students.size() > 0 ? sum / students.size() : 0;
    }
}

public class Zadanie6 {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("Jan Kowalski", 4.0));
        school.addStudent(new Student("Anna Nowak", 5.0));

        System.out.println("Average grade: " + school.calculateAverageGrade());
    }
}
