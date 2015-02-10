package info.deepidea.designpatterns.structural.adapter;

public class FormatAdapter implements Converter {
    public static final String DOCX_FORMAT = "docx";
    public static final String RTF_FORMAT = "rtf";

    private ProprietaryFormatsConverter proprietaryConverter;

    public FormatAdapter(String documentFormat) {
        if (DOCX_FORMAT.equalsIgnoreCase(documentFormat)) {
            proprietaryConverter = new DocxConverter();
        } else if (RTF_FORMAT.equalsIgnoreCase(documentFormat)) {
            proprietaryConverter = new RtfConverter();
        }
    }

    @Override
    public void convertToPdf(String type, String filename) {
        if (DOCX_FORMAT.equalsIgnoreCase(type)) {
            proprietaryConverter.convertDocx(filename);
        } else if (RTF_FORMAT.equalsIgnoreCase(type)) {
            proprietaryConverter.convertRtf(filename);
        }
    }
}
