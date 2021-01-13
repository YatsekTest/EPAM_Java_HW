
public class String1 {
    public static void main(String[] args) {

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
