package info.deepidea.designpatterns.structural.flyweight;

/**
 * Created by pavelkulakovsky on 12.03.15.
 */
public class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
