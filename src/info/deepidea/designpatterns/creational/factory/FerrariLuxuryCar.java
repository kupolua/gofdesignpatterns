package info.deepidea.designpatterns.creational.factory;


public class FerrariLuxuryCar implements Car {
    @Override
    public void beep() {
        System.out.println(getClass().getName());
    }
}
