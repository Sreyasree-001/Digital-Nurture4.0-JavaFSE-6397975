public class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        System.out.println("New Word document created");
        return new WordDocument();
    }
}
