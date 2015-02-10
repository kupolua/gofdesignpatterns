package info.deepidea.designpatterns.structural.decorator;

public class BumperDecorator extends CarDecorator {

    public BumperDecorator(Car specialCar) {
        super(specialCar);
    }

    public String showCar() {
        return specialCar.showCar() + addBumper();
    }

    private String addBumper() {
        return " + used front bumper";
    }
}
