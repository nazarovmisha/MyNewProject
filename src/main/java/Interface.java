import java.util.Arrays;
import java.util.HashMap;

public class Interface {
    public static void main(String[] args) {
        Object map = new HashMap<>();
        Class [] interfaces = map.getClass().getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

    }
}
