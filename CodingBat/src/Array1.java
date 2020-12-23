public class Array1 {
    public static void main(String[] args) {
//        System.out.println(firstLast6(new int[]{1, 2, 6}));

    }

    static int[] frontPiece(int[] nums) {
//        if(nums.length <= 2) return nums;
        return (nums.length <= 2) ? nums : new int[]{nums[0], nums[1]};
    }

    static int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        if(middle > first && middle > last) return middle;
        else if(last > first && last > middle) return last;
        return first;
    }

    static int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    static int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0] + a[1];
        int bSum = b[0] + b[1];
        if (aSum >= bSum) return a;
        return b;
    }

    static int start1(int[] a, int[] b) {
        if ((a.length > 0 && a[0] == 1) && (b.length > 0 && b[0] == 1)) return 2;
        else if ((a.length > 0 && a[0] == 1) || (b.length > 0 && b[0] == 1)) return 1;
        return 0;
    }

    static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) return new int[]{nums[0], 0, nums[2]};
        else if (nums[1] == 2 && nums[2] == 3) return new int[]{nums[0], nums[1], 0};
        return nums;
    }

    static boolean double23(int[] nums) {
        if (nums.length > 1) return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
        else return false;
    }

    static int[] makeLast(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        newNums[newNums.length - 1] = nums[nums.length - 1];
        return newNums;
    }

    static boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
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
