package singleton;

public class Nested {
    private Nested(){}
    public static Nested getInstance(){return SingletonHolder.instance;}

    private static class SingletonHolder{
        private static final Nested instance = new Nested();
    }
}
