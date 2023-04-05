public class SuperClass {
    public static void main(String[] args) {
        String str = "Abc";
        Class superclass = str.getClass().getSuperclass();
        System.out.println(
                superclass.getSimpleName()
        );
    }
}
