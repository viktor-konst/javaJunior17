package lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(7);
        nums.add(8);
        for (int i=0; i<nums.size();i++){
            System.out.print(nums.get(i));
        }
        for(int num:nums){
            System.out.print(num);
        }
        System.out.println();
        for(Iterator<Integer> iter= nums.iterator();iter.hasNext();){
            System.out.print(iter.next());
        }
    }
}
