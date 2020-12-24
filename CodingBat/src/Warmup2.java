public class Warmup2 {
    public static void main(String[] args) {
//        System.out.println(stringTimes("Hi", 2));
        System.out.println(frontTimes("Chocolate", 5));
    }

    static String frontTimes(String str, int n) {
        String newStr = "";
        String subStr = "";
        if(str.length() >= 3) subStr = str.substring(0, 3);
        else subStr = str;
        for (int i = 0; i < n; i++) {
            newStr += subStr;
        }
        return newStr;
    }

    static String stringTimes(String str, int n) { // Более изящно можно решить со StringBuilder.
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
    }

}

