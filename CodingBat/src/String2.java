public class String2 {
    public static void main(String[] args) {
//        System.out.println(prefixAgain("aa", 1));
    }

    static boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;
        if (str.length() == 3) return str.equals("xyz");
        int middle = str.length() / 2;
        if ((str.length() % 2 == 0) && (str.substring(middle - 2).startsWith("xyz")
                || str.substring(middle - 1).startsWith("xyz"))) return true;
        return (str.length() % 2 == 1) && (str.substring(middle - 1).startsWith("xyz")
                || str.substring(middle).equals("xyz"));
    }

    static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (str.substring(i).startsWith(prefix)) return true;
        }
        return false;
    }

    static String repeatSeparator(String word, String sep, int count) {
        StringBuilder newStr = new StringBuilder();
        if (count == 0) return "";
        for (int i = 0; i < count - 1; i++) {
            newStr.append(word).append(sep);
        }
        return newStr.toString() + word;
    }

    static String repeatFront(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n; i++) newStr.append(str, 0, n - i);
        return newStr.toString();
    }

    static String repeatEnd(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        String substring = str.substring(str.length() - n);
        //noinspection StringRepeatCanBeUsed
        for (int i = 0; i < n; i++) newStr.append(substring);
        return newStr.toString();
    }

    static String mixString(String a, String b) {
        StringBuilder newStr = new StringBuilder();
        String longString = a.length() >= b.length() ? a : b;
        for (int i = 0; (i < a.length() && i < b.length()); i++) {
            newStr.append(a.charAt(i));
            newStr.append(b.charAt(i));
        }
        return newStr.toString() + longString.substring(Math.min(a.length(), b.length()));
    }

    static boolean xyBalance(String str) {
        int x = -1;
        int y = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') x = i;
            if (str.charAt(i) == 'y') y = i;
        }
        return y >= x;
    }

    static boolean bobThere(String str) {
        if (str.length() < 3) return false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    static boolean xyzThere(String str) {
        if (str.length() < 3) return false;
        if (str.startsWith("xyz")) return true;
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i).startsWith("xyz") && str.charAt(i - 1) != '.') return true;
        }
        return false;
    }

    static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) ||
                b.toLowerCase().endsWith(a.toLowerCase());
    }

    static int countCode(String str) {
        int count = 0;
        if (str.length() < 4) return 0;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i).startsWith("co") && str.charAt(i + 3) == 'e') count++;
        }
        return count;
    }

    static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("cat")) countCat++;
            if (str.substring(i).startsWith("dog")) countDog++;
        }
        return countCat == countDog;
    }

    static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i).startsWith("hi")) count++;
        }
        return count;
    }

    static String doubleChar(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }
        return newStr.toString();
    }

}
