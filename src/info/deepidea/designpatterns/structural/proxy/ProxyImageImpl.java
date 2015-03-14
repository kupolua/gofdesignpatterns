package info.deepidea.designpatterns.structural.proxy;

public class ProxyImageImpl implements Image {
    private RealImageImpl realImageImpl;
    private String fileName;

    public ProxyImageImpl(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImageImpl == null){
            realImageImpl = new RealImageImpl(fileName);
        }
        realImageImpl.display();
    }
}
