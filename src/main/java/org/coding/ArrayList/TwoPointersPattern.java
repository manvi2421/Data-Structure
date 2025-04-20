    package org.coding.ArrayList;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class TwoPointersPattern {
        /*Working with sorted lists
          Removing elements in-place
          Comparing elements from both ends
          Moving/partitioning values (e.g. evens/odds, 0s/1s)*/
        public int checkPallindrome(List<Integer> list4) {
            int left4 = 0;
            int right4 = list4.size()-1;
            while (left4 < right4) {
                if (list4.get(left4) != list4.get(right4)) {
                    return -1;
                }
                else {
                    left4++;
                    right4--;
                }
            }
            return 1;
        }

        public static void main(String[] args) {
            TwoPointersPattern obj = new TwoPointersPattern();
            // Example 1: Remove Duplicates From Sorted ArrayList
            List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,3,4,4,5,6,6));
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

            System.out.println("List after removing duplicates: "+list);

            // Example 2: Partition ArrayList (Move all even numbers to front)
            List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 8, 5, 12, 7, 4, 9));
            System.out.println("List 2: "+ list1);
            int left = 0;
            int right = list1.size()-1;
            while(left<right){
                while(left<right && list1.get(left)%2==0) left++;
                while(left<right && list1.get(right)%2!=0) right--;
                if(left<right){
                    int temp = list1.get(left);
                    list1.set(left,list1.get(right));
                    list1.set(right,temp);
                }
            }
            System.out.println("List after moving even to front: "+list1);

            //Example 3 : Reverse an ArrayList In-Place
            List<Integer> list3  = new ArrayList<>(Arrays.asList(1,4,3,5,7,44,8,9));
            System.out.println("List 3 : "+list3);
            int left1=0;
            int right1 = list3.size()-1;
            while(left1<right1){
                int temp1=list3.get(left1);
                list3.set(left1, list3.get(right1));
                list3.set(right1,temp1);
                left1++;
                right1--;
            }
            System.out.println("Reversed list: "+list3);

            //Example 4: Check if ArrayList is a Palindrome
            List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,2,1));
            System.out.println("List 4: "+list4);
            int res = obj.checkPallindrome(list4);
            if(res<0)
                System.out.println("List 4 is not pallindrome");
            else
                System.out.println("List 4 is pallindrome");

        }
    }
