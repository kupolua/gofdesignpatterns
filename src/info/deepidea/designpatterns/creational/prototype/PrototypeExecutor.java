package info.deepidea.designpatterns.creational.prototype;

public class PrototypeExecutor {
    public static void main(String[] args) throws CloneNotSupportedException {
        Wheel wheel = new Wheel(15);

        Prototype clone = wheel.clone();
        clone.setSize(17);
        Prototype clone2 = wheel.clone();
        clone2.setSize(19);

        wheel.printSize();
        clone.printSize();
        clone2.printSize();

    }
}
