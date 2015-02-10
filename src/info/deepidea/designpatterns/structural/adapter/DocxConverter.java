package info.deepidea.designpatterns.structural.adapter;

public class DocxConverter implements ProprietaryFormatsConverter {

    @Override
    public void convertDocx(String fileName) {
        System.out.println("DOCX file <" + fileName + "> has been converted to PDF.");
    }

    @Override
    public void convertRtf(String fileName) {

    }
}
