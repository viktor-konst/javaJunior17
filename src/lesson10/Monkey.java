package lesson10;

public class Monkey extends AbcAnimal implements ZooAnimal {
    public Monkey(String name) {
        this.name=name;
    }

    @Override
    public void voice() {
        System.out.println("YYYYYYAAAYYYYYYyaa");
    }

    @Override
    public void jump() {
        System.out.println("obez'jana prigaet");
    }

    @Override
    public void printHello() {
        System.out.println("привет я обезьяна по имени"+name);
    }
}
