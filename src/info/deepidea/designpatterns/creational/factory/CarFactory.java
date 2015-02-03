package info.deepidea.designpatterns.creational.factory;

/**
 * usage in JDK
 * java.sql.DriverManager#getConnection()
 * java.net.URL#openConnection()
 * java.lang.Class#newInstance()
 * java.lang.Class#forName()
 *
 * - simplifies difficult object creation
 * - can return different inherited object for given abstraction
 * - less constructors
 * - can create better API
 * - etc
 *
 * Other examples:
 * http://howtodoinjava.com/2012/10/23/implementing-factory-design-pattern-in-java/
 * http://alvinalexander.com/java/java-factory-pattern-example
 * http://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html
 */
public class CarFactory {

    /**
        prefer using enum as parameter instead of String parameter
     */
    public static Car createCar(CarType carType) {
        Car defaultCar = new FordCar();
        Car result;
        switch (carType) {
            case Sedan:
                result = new HyundaiSedanCar();
                break;
            case Luxury:
                result = new FerrariLuxuryCar();
                break;
            case Sport:
                result = new HondaSportCar();
                break;
            default:
                result = defaultCar;
                // or new IllegalArgumentException("illegal car type: " + carType);
                break;
        }
        return result;
    }
}
