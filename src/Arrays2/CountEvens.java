package Arrays2;

import java.util.ArrayList;

public class CountEvens {
    public static int countEvens(int[] nums){
        ArrayList al=new ArrayList();
        for(int i:nums){
            if(i%2==0){
                al.add(i);
            }
        }
        return al.size();
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }
}
