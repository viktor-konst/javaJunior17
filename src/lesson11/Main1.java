package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(0,"gdsfg" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Метод add arrayList- " + (endTime - startTime));

        LinkedList<String> linkedList = new LinkedList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(0,"gdsfg" + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Метод add linkedList- " + (endTime1 - startTime1));
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Метод getArray list- " + (endTime2 - startTime2));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Метод get linkedList- " + (endTime3 - startTime3));
    }
}
