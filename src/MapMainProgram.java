import java.util.HashMap;
import java.util.Map;

public class MapMainProgram {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");
        System.out.println(returnSize(names));
    }

    public static int returnSize(Map names) {
        int count = 0;
        for (Object key : names.keySet()) {
            count++;
        }

        return count;
    }
}