package info.deepidea.designpatterns.creational.factory;

public class FordCar implements Car {
    @Override
    public void beep() {
        System.out.println(getClass().getName());
    }
}
