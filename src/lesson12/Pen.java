package lesson12;

import java.util.Objects;

public class Pen {
    private String color;
    private String type;
    private int price;

    public Pen() {
    }

    public Pen(String color) {
        this.color = color;
    }

    public Pen(String color, String type, int price) {
        this.color = color;
        this.type = type;
        this.price = price;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return getPrice() == pen.getPrice() &&
                Objects.equals(getColor(), pen.getColor()) &&
                Objects.equals(getType(), pen.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getType(), getPrice());
    }
}
