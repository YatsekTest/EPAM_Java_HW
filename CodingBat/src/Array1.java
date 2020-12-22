public class Array1 {
    public static void main(String[] args) {
//        System.out.println(firstLast6(new int[]{1, 2, 6}));

    }

    static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

}
