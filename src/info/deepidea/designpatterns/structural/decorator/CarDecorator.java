package info.deepidea.designpatterns.structural.decorator;

abstract class CarDecorator implements Car {
    protected Car specialCar;

    public CarDecorator(Car specialCar) {
        this.specialCar = specialCar;
    }

    public String showCar() {
        return specialCar.showCar();
    }
}
