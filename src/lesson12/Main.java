package lesson12;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={3,4,5,6,3,23,5,232,5,325,65,7,59,8};
        HashSet<Integer> set= new HashSet<>();
        for (int num:numbers){
            set.add(num);
        }
        System.out.println(set);
    }
}
