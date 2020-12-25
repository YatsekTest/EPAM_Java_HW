public class Warmup2 {
    public static void main(String[] args) {
//        System.out.println(stringTimes("Hi", 2));
//        System.out.println(frontTimes("Chocolate", 5));
//        System.out.println(countXXX("xxxx"));
//        System.out.println(doubleX("xaxxx"));
//        System.out.println(stringBits("Heeololeo"));
//        System.out.println(stringSplosion("Code"));
//        System.out.println(arrayCount(new int[]{1, 9, 9, 3, 9}));
//        System.out.println(arrayFront9(new int[]{1, 2, 3, 9, 4}));
//        System.out.println(stringX("abxxxcd"));
    }

    static String stringYak(String str) {
        return str.replace("yak", "");
//        Решение приведённое на сайте:
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            // Look for i starting a "yak" -- advance i in that case
//            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
//                i = i + 2;
//            } else { // Otherwise do the normal append
//                result = result + str.charAt(i);
//            }
//        }
//        return result;
    }

    static String altPairs(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) end = str.length();
            newStr.append(str.substring(i, end));
        }
        return newStr.toString();
    }

    static String stringX(String str) {
        String newStr = "";
        String first = "";
        String last = "";
        if (str.length() > 1) first = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) if (!(str.charAt(i) == 'x')) newStr += str.charAt(i);
        if (str.length() > 0) last = String.valueOf(str.charAt(str.length() - 1));
        return first + newStr + last;
//        On site solution:
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            // Only append the char if it is not the "x" case
//            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
//                result = result + str.substring(i, i + 1); // Could use str.charAt(i) here
//            }
//        }
//        return result;
    }

    static int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) count++;
        }
        return count;
    }

    static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) if (nums[i] == 9) return true;
        return false;
    }

    static int arrayCount(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) count++;
        }
        return count;
    }

    static int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;
        String end = str.substring(str.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;
        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }
        return count;
    }

    static String stringSplosion(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(0, i + 1);
        }
        return newStr;
    }

    static String stringBits(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            newStr += String.valueOf(str.charAt(i));
        }
        return newStr;
    }

    static boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index + 1 >= str.length() || index < 0) return false;
        return str.startsWith("xx", index);
    }

    static int countXXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            /*
             if (str.substring(i, i + 2).equals("xx")) count++;
             Тут для себя я обнаружил важный момент: методу substring вторым числом можно передавать индекс на 1
             больше чем последний существующий индекс в строке, потому как для него метод берёт endIndex-1.
             Таким образом, выход за пределы существующих индексов не происходит. Например, если в строке str всего
             3 буквы (последний индекс в строке == 2), то метод может выглядеть как str.substring(0, 3).
            */
            if (str.startsWith("xx", i)) count++;
            /*
             IDE подсказывает, что лучше использовать startsWith()!!!
             Опытным путём было установлено, что индекс i с которого метод startsWith() ищет совпадение с
             указанной подстрокой может быть вообще любым, в т.ч. несуществующим или выходящим за границы
             существующих в строке индексов символов. Исключение не выбрасывается.
            */
        }
        return count;
    }

    static String frontTimes(String str, int n) {
        String newStr = "";
        String subStr;
        if (str.length() >= 3) subStr = str.substring(0, 3);
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

