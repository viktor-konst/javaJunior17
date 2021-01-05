package lesson10;

import java.util.Objects;

public abstract class AbcAnimal implements ZooAnimal {
    protected String name;

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbcAnimal)) return false;
        AbcAnimal abcAnimal = (AbcAnimal) o;
        return Objects.equals(name, abcAnimal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
