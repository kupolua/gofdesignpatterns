package info.deepidea.designpatterns.creational.abstractfactory;

public class BmwFactory implements AbstractCarFactory {
    @Override
    public SportCar getSportCar() {
        return new Concept();
    }

    @Override
    public LuxuryCar getLuxuryCar() {
        return new BenzE();
    }
}
