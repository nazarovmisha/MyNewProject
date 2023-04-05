import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;

public class getDeclaredFields {
    public static void main(String[] args) {
        Object map = new HashMap<>();
        Constructor[] fields = map.getClass().getConstructors();
        Arrays.stream(fields).forEach(System.out::println);
    }
}
