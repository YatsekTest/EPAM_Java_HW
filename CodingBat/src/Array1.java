public class Array1 {
    public static void main(String[] args) {
//        System.out.println(firstLast6(new int[]{1, 2, 6}));

    }

    static boolean has23(int[] nums) {
        return nums[0] == 2 ||  nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    static int sum2(int[] nums) {
        if (nums.length > 1) return nums[0] + nums[1];
        else if (nums.length == 1) return nums[0];
        return 0;
    }

    static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
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
