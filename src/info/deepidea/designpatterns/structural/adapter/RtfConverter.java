package info.deepidea.designpatterns.structural.adapter;

public class RtfConverter implements ProprietaryFormatsConverter {

    @Override
    public void convertDocx(String fileName) {

    }

    @Override
    public void convertRtf(String fileName) {
        System.out.println("RTF file <" + fileName + "> has been converted to PDF.");
    }
}
