package info.deepidea.designpatterns.creational.singleton;

public class SimpleLazySingleton {
    private static SimpleLazySingleton instance;

    private SimpleLazySingleton(){}

    public synchronized static SimpleLazySingleton newInstance() {
        if (instance == null) {
            instance = new SimpleLazySingleton();
        }
        return instance;
    }

}
