package info.deepidea.designpatterns.creational.singleton;

/**
 * Created by emix on 12/30/14.
 */
public class SingletonFinalWrapper<T> {
    public final T value;

    public SingletonFinalWrapper(T value) {
        this.value = value;
    }
}

