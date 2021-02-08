import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}
