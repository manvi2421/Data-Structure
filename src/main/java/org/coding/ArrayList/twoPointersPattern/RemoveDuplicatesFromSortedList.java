package org.coding.ArrayList.twoPointersPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,3,4,4,5));
        System.out.println("Sorted List: "+ list);
        int i=0;
        for(int j=1;j<list.size();j++){
            if(!list.get(i).equals(list.get(j))){
                i++;
                list.set(i, list.get(j));


            }
        }
        while(list.size()>i+1){
            list.remove(list.size()-1);
        }
        System.out.println("List after removing duplicates: "+ list);

    }
}
