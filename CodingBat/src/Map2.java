import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }

}
