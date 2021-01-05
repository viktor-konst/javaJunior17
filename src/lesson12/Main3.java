package lesson12;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Pen pen1 =new Pen("синий","шариковая",120);
        Pen pen2 =new Pen("синий","шариковая",120);
        Pen pen3 =new Pen("желтый","перьевая",366);
        Pen pen4 =new Pen("розовый","гелевая",754);
        Pen pen5 =new Pen("красный","3д",467);
        HashSet<Pen> pens = new HashSet<>();
        pens.add(pen1);
        pens.add(pen2);
        pens.add(pen3);
        pens.add(pen4);
        pens.add(pen5);
        for (Pen pen:pens){
            System.out.println(pen);
        }
    }
}
