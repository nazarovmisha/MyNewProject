public class Package {
    public static void main(String[] args) {
        Object obj = 5;
        Class clazz = obj.getClass();
        java.lang.Package classPackage = clazz.getPackage();
        System.out.println(classPackage.getName());
    }
}
