public class Logic2 {
    public static void main(String[] args) {

    }

    static boolean makeBricks(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }

}
