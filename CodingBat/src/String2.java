public class String2 {
    public static void main(String[] args) {

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
