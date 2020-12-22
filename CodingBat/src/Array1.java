public class Array1 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 6};
//        System.out.println(firstLast6(nums));

    }

    static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

}
