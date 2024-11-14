public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Cześć, mam na imię " + name + " i mam " + age + " lat.");
    }

    public static void main(String[] args) {
        Person osoba = new Person("Krzysiek", 20);
        osoba.introduce();
    }
}
