public class Warmup2 {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
    }

    static String stringTimes(String str, int n) { // Более изящно можно решить со StringBuilder.
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
    }

}

