package org.coding.ArrayList.twoPointersPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,5,4,7,6,8,9));
        System.out.println("List: "+ list);
        int left=0;
        int right= list.size()-1;
        while(left<right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Reverse List: "+ list);

    }
}
