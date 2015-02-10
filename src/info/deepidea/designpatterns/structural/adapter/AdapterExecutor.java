package info.deepidea.designpatterns.structural.adapter;

public class AdapterExecutor {
    public static void main(String[] args) {
        OpenDocumentConverter converter = new OpenDocumentConverter();

        converter.convertToPdf("ODT", "prototype.odt");
        converter.convertToPdf("RTF", "factory.rtf");
        converter.convertToPdf("DOCX", "builder.docx");
        converter.convertToPdf("CDR", "UML_decorator.cdr");
    }
}
