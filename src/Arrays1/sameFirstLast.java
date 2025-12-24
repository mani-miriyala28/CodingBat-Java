package Arrays1;

import java.util.ArrayList;

//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//
//
//sameFirstLast([1, 2, 3]) → false
//sameFirstLast([1, 2, 3, 1]) → true
//sameFirstLast([1, 2, 1]) → true
public class sameFirstLast {
    public boolean checkSameFirstLast(int[] nums){
        ArrayList<Object> al=new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        return al.size()>=1 && al.get(0).equals(al.get(al.size()-1));
    }

    public static void main(String[] args) {
        sameFirstLast sfl=new sameFirstLast();
        System.out.println(sfl.checkSameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sfl.checkSameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sfl.checkSameFirstLast(new int[]{1, 2, 1}));
    }
}
