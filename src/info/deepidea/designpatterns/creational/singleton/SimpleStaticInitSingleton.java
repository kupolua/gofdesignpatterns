package info.deepidea.designpatterns.creational.singleton;

public class SimpleStaticInitSingleton {
    private static final SimpleStaticInitSingleton INSTANCE = new SimpleStaticInitSingleton();

    private SimpleStaticInitSingleton() {
        throw new IllegalStateException("creating object in constructor is forbidden");
    }

    public static SimpleStaticInitSingleton newInstance() {
        return INSTANCE;
    }

}
