
public class String1 {
    public static void main(String[] args) {

    }

    static String withoutX(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!((i == 0 || i == str.length() - 1) && str.charAt(i) == 'x')) newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }

    static String startWord(String str, String word) {
        if (str.length() >= word.length()) {
            if (str.substring(1, word.length()).equals(word.substring(1))) return str.substring(0, word.length());
        }
        return "";
    }

    static String deFront(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'a') newStr.append(str.charAt(i));
            if (i == 1 && str.charAt(i) == 'b') newStr.append(str.charAt(i));
            if (i > 1) newStr.append(str.charAt(i));
        }
        return newStr.toString();
    /*  String first = "";
        String second = "";
        if (str.length() == 0) return str;
        if (str.length() == 1) {
            if (str.startsWith("a")) return str;
            else return "";
        }
        if (str.length() >= 2) {
            first = String.valueOf(str.charAt(0));
            second = String.valueOf(str.charAt(1));
            if (!first.equals("a")) first = "";
            if (!second.equals("b")) second = "";
        }
        return first + second + str.substring(2);    */
    }

    static String without2(String str) {
        if (str.length() < 2) return str;
        if (str.length() == 2) return "";
        String end = str.substring(str.length() - 2);
        if (str.startsWith(end)) return str.substring(2);
        else return str;
    }

    static String extraFront(String str) {
        if (str.length() <= 2) return str + str + str;
        String newStr = str.substring(0, 3);
        return newStr + newStr + newStr;
    }

    static String minCat(String a, String b) {
        if (a.length() == b.length()) return a + b;
        if (a.length() > b.length()) return a.substring(a.length() - b.length()) + b;
        return a + b.substring(b.length() - a.length());
    }

    static boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        if (str.length() == 2) return true;
        String end = str.substring(str.length() - 2);
        return str.startsWith(end);
    }

    static String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    static String lastTwo(String str) {
        if (str.length() >= 2)
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        else return str;
    }

    static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        String first = b.substring(0, 1);
        if (a.endsWith(first)) return a + b.substring(1);
        return a + b;
    }

    static String lastChars(String a, String b) {
        if (a.length() == 0) a = "@";
        else a = a.substring(0, 1);
        if (b.length() == 0) b = "@";
        else b = b.substring(b.length() - 1);
        return a + b;
    }

    static String atFirst(String str) {
        if (str.length() == 0) return "@@";
        if (str.length() == 1) return str.charAt(0) + "@";
        if (str.length() == 2) return str;
        return str.substring(0, 2);
    }

    static boolean hasBad(String str) {
        if (str.length() < 3) return false;
        if (str.length() == 3) return str.equals("bad");
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

    static String middleThree(String str) {
        if (str.length() <= 3) return str;
        return str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2) + str.charAt(str.length() / 2 + 1);
    }

    static String twoChar(String str, int index) {
        if (str.length() - index < 2 || index < 1) return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

    static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    static boolean endsLy(String str) {
        if (str.length() >= 2) return str.endsWith("ly");
        else return false;
    }

    static String middleTwo(String str) {
        if (str.length() <= 3) return str;
        return str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2);
    }

    static String withoutEnd2(String str) {
        if (str.length() <= 2) return "";
        return str.substring(1, str.length() - 1);
    }

    static String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    static String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

    static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    static String firstTwo(String str) {
        if (str.length() <= 2) return str;
        return str.substring(0, 2);
    }

    static String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return String.format("%s%s%s", substring, substring, substring);
    }

    static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    static String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

    static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    static String helloName(String name) {
        return "Hello " + name + "!";
    }

}
