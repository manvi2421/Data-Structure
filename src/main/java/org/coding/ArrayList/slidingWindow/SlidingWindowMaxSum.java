package org.coding.ArrayList.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
/*        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));
 */
public class SlidingWindowMaxSum {
    /*  Example 1 : "Find the maximum sum of a sublist of size k from an ArrayList."

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 1, 3, 2));

        Explanation (Step-by-step):
        First sum the first k elements → 2 + 1 + 5 = 8

        Now slide the window:

        Remove 2 (first element), add 1 → 8 - 2 + 1 = 7

        Remove 1, add 3 → 7 - 1 + 3 = 9 ← max!

        Remove 5, add 2 → 9 - 5 + 2 = 6

        Keep updating the max sum
    */
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(2, 1, 5, 11, 3, 2));
        System.out.println("List: "+ list);
         int maxSum=0;
         int slideSum=0;
         int k=3;
         for(int i=0;i<k;i++){
             slideSum+= list.get(i);
         }
         maxSum=slideSum;
         for(int j=k;j<list.size();j++){
             slideSum+=list.get(j)-list.get(j-k);
             maxSum=Math.max(slideSum,maxSum);
         }
        System.out.println("Maximum sum of sublist for k = "+k+" is: "+maxSum);

    }
}
