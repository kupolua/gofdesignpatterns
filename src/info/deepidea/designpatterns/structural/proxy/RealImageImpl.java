package info.deepidea.designpatterns.structural.proxy;

public class RealImageImpl implements Image {
    private String fileName;

    public RealImageImpl(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
