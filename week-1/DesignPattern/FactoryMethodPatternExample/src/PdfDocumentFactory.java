public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        System.out.println("New Pdf document created");
        return new PdfDocument();
    }
}
