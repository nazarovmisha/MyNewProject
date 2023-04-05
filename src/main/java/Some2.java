import java.lang.reflect.Modifier;

import static java.lang.Class.*;

public class Some2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class arrayList = forName("java.util.ArrayList");
        Class abstractList = forName("java.util.AbstractList");
        Class collection = forName("java.util.Collection");

        int listMapModifiers =arrayList.getModifiers();
        int abstractListModifiers = abstractList.getModifiers();
        int collectionMapModifiers = collection.getModifiers();

        System.out.println("ArrayList class is public: " + Modifier.isPublic(listMapModifiers));
        System.out.println("ArrayList class is protected: " + Modifier.isProtected(listMapModifiers));
        System.out.println("AbstractList class is abstract: " + Modifier.isAbstract(abstractListModifiers));
        System.out.println("AbstractList class is static: " + Modifier.isStatic(abstractListModifiers));
        System.out.println("Collection class is interface: " + Modifier.isInterface(collectionMapModifiers));



    }
}
