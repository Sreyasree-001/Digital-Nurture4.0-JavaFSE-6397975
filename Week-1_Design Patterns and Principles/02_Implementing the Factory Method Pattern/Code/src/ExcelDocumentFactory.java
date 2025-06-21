public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        System.out.println("New Excel document created");
        return new ExcelDocument();
    }
}
