package info.deepidea.designpatterns.creational.abstractfactory;

public class ToyotaFactory implements AbstractCarFactory {
    @Override
    public SportCar getSportCar() {
        return new Supra();
    }

    @Override
    public LuxuryCar getLuxuryCar() {
        return new Avalon();
    }
}
