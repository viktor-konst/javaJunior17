package lesson8;

import java.util.Objects;

public class Book {
    private String name;
    private String avtor;
    private String izdanie;
    private int price;
    private int salesPercent;

    /*
    формула создание конструкта
    1) модификатор доступа
    2)название коснтруктора(полностью совпадает с название класса)
    3) входящие параметры
    4) тело самого конструктора
     */
    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getIzdanie() {
        return izdanie;
    }

    public void setIzdanie(String izdanie) {
        this.izdanie = izdanie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalesPercent() {
        return salesPercent;
    }

    public void setSalesPercent(int salesPercent) {
        this.salesPercent = salesPercent;
    }

    public Book(String name, String avtor) {
        this.name = name;
        this.avtor = avtor;
    }



    public Book(String name, String avtor, String izdanie, int price, int salesPercent) {
        this.name = name;
        this.avtor = avtor;
        this.izdanie = izdanie;
        this.price = price;
        this.salesPercent = salesPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) &&
                Objects.equals(getAvtor(), book.getAvtor()) &&
                Objects.equals(getIzdanie(), book.getIzdanie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAvtor(), getIzdanie());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", avtor='" + avtor + '\'' +
                ", izdanie='" + izdanie + '\'' +
                ", price=" + price +
                ", salesPercent=" + salesPercent +
                '}';
    }
}
