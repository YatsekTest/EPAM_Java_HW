public class Logic2 {
    public static void main(String[] args) {

    }

    static int luckySum(int a, int b, int c) {
        if(a == 13) return 0;
        if(b == 13) return a;
        if(c == 13) return a + b;
        return a + b + c;
    }

    static int loneSum(int a, int b, int c) {
       if(a == b && a == c) return 0;
       if(a == b) return c;
       if(a == c) return b;
       if(b == c) return a;
       return a + b + c;
    }

    static boolean makeBricks(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }

}
