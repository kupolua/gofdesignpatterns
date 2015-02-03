package info.deepidea.designpatterns.creational.singleton;


import org.junit.Test;

/**
 * Created by emix on 12/30/14.
 */
public class SingletonFinalWrapperUser {
    private SingletonFinalWrapper<Helper> helperWrapper;

    public Helper getHelper() {
        SingletonFinalWrapper<Helper> wrapper = helperWrapper;
        if (wrapper == null) {
            synchronized(this) {
                if (helperWrapper == null) {
                    helperWrapper = new SingletonFinalWrapper<Helper>(new Helper());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }

    @Test
    public void test() {
        System.out.println(0.9 * 0.05 + 0.47 * 0.05);
//        Arrays.sort(null);
    }


}
