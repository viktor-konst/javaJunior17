package lesson10;

public class Elephant extends AbcAnimal{


    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("TTTTTTTTTTTTTPPPPPPPPPPpppp");
    }

    @Override
    public void jump() {
        System.out.println(" slon prigaet");
    }



    @Override
    public void printHello() {
        System.out.println("Привет я слон,"+name);

    }



}
