package list01.factory.digitalDocuments;

public class Invoice implements Document {
    @Override
    public void sign() {
        System.out.println("Signing Invoice Document");
    }
}