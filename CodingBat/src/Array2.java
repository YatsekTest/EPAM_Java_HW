public class Array2 {
    public static void main(String[] args) {
//        System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
//        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));

    }

    static boolean no14(int[] nums) {
        for (int i : nums) {
            if (i == 1) {
                for (int j : nums) {
                    if (j == 4) return false;
                }
            } else if (i == 4) {
                for (int k : nums) {
                    if (k == 1) return false;
                }
            }
        }
        return true;
    }

    static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) array[i] = String.valueOf(i);
        return array;
    }

    static boolean only14(int[] nums) {
        for (int num : nums) if (num != 1 && num != 4) return false;
        return true;
    }

    static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n - 1; i++) array[i + 1] = array[i] + 1;
        return array;
    }

    static boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int num : nums) {
            if (num == 1) ones++;
            if (num == 4) fours++;
        }
        return ones > fours;
    }

    static boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) if (num == 2) sum += num;
        return sum == 8;
    }

    static boolean lucky13(int[] nums) {
        for (int num : nums) if (num == 1 || num == 3) return false;
        return true;
    }

    static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) if (nums[i] == 2 && nums[i + 1] == 2) return true;
        return false;
    }

    static int sum67(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                sum += nums[i];
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j;
                        break;
                    }
                }
            }
        }
        return sum;
    }

    static int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) sum += nums[i];
            else i++;
        }
        return sum;
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
