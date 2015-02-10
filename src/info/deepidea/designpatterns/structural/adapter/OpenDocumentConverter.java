package info.deepidea.designpatterns.structural.adapter;

public class OpenDocumentConverter implements Converter {

    @Override
    public void convertToPdf(String type, String fileName) {
        final String odtFormat = "odt";
        final String docxFormat = "docx";
        final String rtfFormat = "rtf";

        if(odtFormat.equalsIgnoreCase(type)){
            System.out.println("ODT file <" + fileName + "> has been converted to PDF.");
        } else {
            if (docxFormat.equalsIgnoreCase(type) || rtfFormat.equalsIgnoreCase(type)) {
                FormatAdapter adapter = new FormatAdapter(type);
                adapter.convertToPdf(type, fileName);
            } else {
                System.out.println(type + " format is not supported.");
            }
        }
    }
}
