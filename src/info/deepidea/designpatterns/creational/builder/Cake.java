package info.deepidea.designpatterns.creational.builder;


/**
 * Helps create an instance and helps to solve next problems
 - separate mandatory and optional fields
 - too many constructors
 - too many fields in constructor
 - easy fields chaining
 - controlling fields initiation, like to forbid

 implemented as inner static class (mostly public)
 with method named like build that returns instance of outer class by calling private constructor of outer class
 usually builder provides check.
 private constructor of outer class accepts builder instance and copies all values
 builder the same fields as outer class

 JDK example
 java.lang.StringBuilder#append() (unsynchronized)
 java.lang.StringBuffer#append() (synchronized)
 java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
 javax.swing.GroupLayout.Group#addComponent()
 All implementations of java.lang.Appendable

 When not to use:
 - never build instance when passing any collection with parameter. that’s terrible
 - builder pattern makes object creating is more complicated. so don’t use it when creating simple object.
 - when it’s too many fields in class it’s sign of too many responsibility to class. solve this problem instead of using builder pattern.
 * */

 public class Cake {
    private final double sugar;   //cup
    private final double butter;  //cup
    private final int eggs;
    private final int vanila;     //spoon
    private final double flour;   //cup
    private final double bakingpowder; //spoon
    private final double milk;  //cup
    private final int cherry;

    public static class Builder {
        private double sugar;   //cup
        private double butter;  //cup
        private int eggs;
        private int vanila;     //spoon
        private double flour;   //cup
        private double bakingpowder; //spoon
        private double milk;  //cup
        private int cherry;

        public Builder(double sugar) {
            this.sugar = sugar;
        }

        //builder methods for setting property
        public Builder sugar(double cup){this.sugar = cup; return this; }
        public Builder butter(double cup){this.butter = cup; return this; }
        public Builder eggs(int number){this.eggs = number; return this; }
        public Builder vanila(int spoon){this.vanila = spoon; return this; }
        public Builder flour(double cup){this.flour = cup; return this; }
        public Builder bakingpowder(double spoon){this.sugar = spoon; return this; }
        public Builder milk(double cup){this.milk = cup; return this; }
        public Builder cherry(int number){this.cherry = number; return this; }


        //return fully build object
        public Cake build() {
            // you can make any other checks
            return new Cake(this);
        }
    }

    //private constructor to enforce object creation through builder
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour=" + flour + ", bakingpowder=" + bakingpowder + ", milk=" + milk + ", cherry=" + cherry + '}';

    }



}

