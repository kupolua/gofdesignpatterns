package info.deepidea.designpatterns.creational.factory;


public class HondaSportCar implements Car{
    @Override
    public void beep() {
        System.out.println(this.getClass().getName());
    }
}
