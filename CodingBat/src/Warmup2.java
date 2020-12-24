public class Warmup2 {
    public static void main(String[] args) {
//        System.out.println(stringTimes("Hi", 2));
//        System.out.println(frontTimes("Chocolate", 5));
        System.out.println(countXXX("xxxx"));
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

