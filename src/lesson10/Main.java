package lesson10;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1= new Monkey("макака");
        Monkey monkey2=new Monkey("бабуин");
        Elephant elephant1= new Elephant("Вася");
        Elephant elephant2= new Elephant("Петя");
        AbcAnimal[] animals= new AbcAnimal[4];
        animals[0]=elephant1;
        animals[1]=elephant2;
        animals[2]=monkey1;
        animals[3]=monkey2;
        for (AbcAnimal animal:animals){
            animal.voice();// проявление полиморфизма
        }

    }
}
