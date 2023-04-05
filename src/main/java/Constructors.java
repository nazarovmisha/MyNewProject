import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;

public class Constructors {
    public static void main(String[] args) {
        Object map = new HashMap<>();
        Constructor[] constructors = map.getClass().getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
    }
}
