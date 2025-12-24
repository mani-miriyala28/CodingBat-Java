package Arrays2;

public class bigDiff {
    public static int findDiff(int[] nums){
        int max=nums[0],min=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return Math.abs(max-min);

    }

    public static void main(String[] args) {
        System.out.println(findDiff(new int[]{10, 3, 5, 6}));
        System.out.println(findDiff(new int[]{7, 2, 10, 9}));
        System.out.println(findDiff(new int[]{-2, 10, 7, 4}));
    }
}
