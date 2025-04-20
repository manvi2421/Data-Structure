package org.coding.ArrayList.twoPointersPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftEvenNumToFront {
    public static void main(String[] args) {
        //unsorted list
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,1,5,6,4,7,11,25,8));
        System.out.println("List: "+ list);
        int left=0;
        int right=list.size()-1;
        while (left<right){
            while (left<right && list.get(left)%2==0)left++;
            while (left<right && list.get(right)%2!=0)right--;
            if(left<right){
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right,temp);
            }
        }
        System.out.println("Shift even to front: "+ list);
    }

}
