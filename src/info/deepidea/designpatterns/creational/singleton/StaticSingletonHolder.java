package info.deepidea.designpatterns.creational.singleton;

/**
 * Created by emix on 12/30/14.
 */
public class StaticSingletonHolder {

    private static class HelperHolder {
        public static final Helper helper = new Helper();
    }

    public static Helper getHelper() {
        return HelperHolder.helper;
    }



}
