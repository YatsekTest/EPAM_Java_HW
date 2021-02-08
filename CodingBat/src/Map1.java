import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }


    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) map.put("b", map.get("a"));
        map.remove("c");
        return map;
    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
