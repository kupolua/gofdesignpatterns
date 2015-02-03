package info.deepidea.designpatterns.creational.singleton;

/**
 * Created by emix on 12/30/14.
 */
// Works with acquire/release semantics for volatile
// Broken under Java 1.5 and earlier semantics for volatile
public class DoubleCheckedSingleton {
    private volatile Helper helper;

    public Helper getHelper() {
        Helper result = helper;
        if (result == null) {
            synchronized (this) {
                result = helper;
                if (result == null) {
                    helper = result = new Helper();
                }
            }
        }
        return result;
    }


}
