import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else map.put(key, i);
        }
        return strings;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) map.put(string, true);
            else map.put(string, false);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String key : strings) {
            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                if (value % 2 == 0) result.append(key);
                map.put(key, value);
            } else map.put(key, 1);
        }
        return result.toString();
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String firstChar = String.valueOf(string.charAt(0));
            StringBuilder builder = new StringBuilder();
            for (String str : strings) {
                if (str.startsWith(firstChar)) builder.append(str);
            }
            map.put(firstChar, builder.toString());
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) map.put(string, 1);
            else map.put(string, map.get(string) + 1);
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            map.put(string.substring(0, 1), string.substring(string.length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }

}
