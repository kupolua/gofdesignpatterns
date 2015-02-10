package info.deepidea.designpatterns.structural.decorator;

public class DecoratorExecutor {
    public static void main(String[] args) {
        Car car = new SpoilerDecorator(new BumperDecorator(new SimpleCar()));
        System.out.println(car.showCar() + " = chetkaya patsanskaya tochila");
    }
}
