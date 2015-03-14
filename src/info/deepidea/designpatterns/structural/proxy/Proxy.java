package info.deepidea.designpatterns.structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
    }
}
