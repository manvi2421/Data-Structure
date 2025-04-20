package org.coding.ArrayList.twoPointersPattern;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkPallindrome {

    public boolean isPallindrome(List<Integer> list){
        int left=0;
        int right=list.size()-1;
        boolean status = true;
        while(left<right){
            if(list.get(left)==list.get(right)){
                left++;
                right--;
            }
            else {
                status = false;
                break;
            }

        }
        return status;


    }
    public static void main(String[] args) {
        checkPallindrome obj = new checkPallindrome();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,2,1));
        System.out.println("List: " +list);
        if(obj.isPallindrome(list))
            System.out.println("List is pallindrome ");
        else
            System.out.println("List is not pallindrome");
    }
}
