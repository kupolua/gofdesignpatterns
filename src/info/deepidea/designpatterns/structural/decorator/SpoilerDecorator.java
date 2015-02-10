package info.deepidea.designpatterns.structural.decorator;

public class SpoilerDecorator extends CarDecorator {

    public SpoilerDecorator(Car specialCar) {
        super(specialCar);
    }

    public String showCar() {
        return specialCar.showCar() + addSpoiler();
    }

    private String addSpoiler() {
        return " + a big wooden spoiler";
    }
}
