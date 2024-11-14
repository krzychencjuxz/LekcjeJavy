public class Book {
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

    public static void main(String[] args) {
        Book ksiazka = new Book("Władca Pierścieni", "J.R.R. Tolkien", 1954);
        ksiazka.displayDetails();
    }
}
