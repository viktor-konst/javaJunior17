package lesson12;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, Integer> recept = new HashMap<>();
        recept.put("Яблоко", 200);
        recept.put("Груша", 100);
        recept.put("Слива", 600);
        recept.put("Морковь", 500);
        recept.put("Банан", 330);
        recept.put("Груша", 300+recept.get("Груша"));
        System.out.println(recept);


        int[] numbers ={3,4,5,6,3,23,5,232,5,325,65,7,59,8};
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(Integer num: numbers){
            if(counter.containsKey(num)){
                counter.put(num,1+ counter.get(num));
            }else {
                counter.put(num, 1);
            }
        }
        System.out.println(counter);
    }
}
