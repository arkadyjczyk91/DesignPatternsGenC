package singleton;

public class Main {
    public static void main(String[] args) {
        //Lazy
        final LazySingleton instance1 = LazySingleton.getInstance();
        final LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance2.equals(instance1));

        //Eager
        final EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        final EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1.equals(eagerSingleton2));

        //Nested
        final  Nested nested1 = Nested.getInstance();
        final  Nested nested2 = Nested.getInstance();

        System.out.println(nested1.equals(nested2));
    }


    }
