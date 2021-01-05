package lesson8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("название1", "автор1", "издание2", 300, 20);
        Book book2 = new Book("название1", "автор1", "издание2", 300, 20);
        Bukvar bukvar = new Bukvar();
        System.out.println(book1.equals(book2));
        System.out.println(book1);

    }
}
