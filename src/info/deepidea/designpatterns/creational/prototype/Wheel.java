package info.deepidea.designpatterns.creational.prototype;

public class Wheel implements Prototype, Cloneable {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void printSize() {
        System.out.println(size);
    }

    @Override
    public Wheel clone() {
        Wheel clone = null;
        try {
            clone = (Wheel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
