package Arrays1;
import java.util.*;
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
//
//
//commonEnd([1, 2, 3], [7, 3]) → true
//commonEnd([1, 2, 3], [7, 3, 2]) → false
//commonEnd([1, 2, 3], [1, 3]) → true
public class sameEnd {
    public static boolean checkSameEnd(int[] a, int[] b){
        ArrayList al1=new ArrayList();
        ArrayList al2=new ArrayList();
        for (int i:a){
            al1.add(i);
        }
        for (int j:b) {
            al2.add(j);
        }
        return al1.get(0).equals(al2.get(0))||al1.get(al1.size()-1).equals(al2.get(al2.size()-1));
    }

    public static void main(String[] args) {
        sameEnd se=new sameEnd();
        System.out.println(se.checkSameEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(se.checkSameEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(checkSameEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}
