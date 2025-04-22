package org.coding.arraysandstring;

public class UniqueCharAtString {
    public boolean isUnique(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Melviin";
        UniqueCharAtString obj = new UniqueCharAtString();
        boolean res = obj.isUnique(str);
        if(res){
            System.out.println("Unique String "+ str);
        }
        else{
            System.out.println(" Not Unique String "+ str);

        }
            }




}
