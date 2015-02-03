package info.deepidea.designpatterns.creational.singleton;

/**
 * Created by emix on 12/30/14.
 */
public class FinalWrapperUser {
    private SingletonFinalWrapper<Helper> helperWrapper;

    public Helper getHelper() {
        SingletonFinalWrapper<Helper > wrapper = helperWrapper;
        if (wrapper == null) {
            synchronized(this) {
                if (helperWrapper == null) {
                    helperWrapper = new SingletonFinalWrapper<Helper > (new Helper());
                }
            wrapper = helperWrapper; }
        } return wrapper.value; }
}
