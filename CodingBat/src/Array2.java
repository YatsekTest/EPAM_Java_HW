public class Array2 {
    public static void main(String[] args) {
//        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
    }

    static int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int sum = 0;
        for (int num : nums) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
            sum += num;
        }
        return (sum - largest - smallest) / (nums.length - 2);
    }

    static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) max = Math.max(max, num);
        for (int num : nums) min = Math.min(min, num);
        return max - min;
    }

    static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) if (num % 2 == 0) count++;
        return count;
    }

}
