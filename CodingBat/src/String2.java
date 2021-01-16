public class String2 {
    public static void main(String[] args) {

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
