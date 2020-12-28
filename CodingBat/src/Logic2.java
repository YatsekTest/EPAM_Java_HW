public class Logic2 {
    public static void main(String[] args) {
        System.out.println(19 % 21);
    }

    static boolean evenlySpaced(int a, int b, int c) {
        return b - a  == c - b || b - a == a - c || a - c == c - b;
    }

    static int blackjack(int a, int b) {
        if(a > 21 && b > 21) return 0;
        if(b > 21) return a;
        if(a > 21) return b;
        if(21 - a < 21 - b) return a;
        else return b;
    }

    static boolean closeFar(int a, int b, int c) {
        if(Math.abs(b - a) <= 1 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) return true;
        return Math.abs(c - a) <= 1 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1;
    }

    static int roundSum(int a, int b, int c) {
       return round10(a) + round10(b) + round10(c);
    }

    static int round10(int num) {
        if(num % 10 >= 5) return num + (10 - num% 10);
        if(num % 10 < 5) return num - num % 10;
        return num;
    }

    static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) return 0;
        else return n;
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
