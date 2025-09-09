package list01.factory.digitalDocuments;

public class Contract implements Document {
    @Override
    public void sign() {
        System.out.println("Signing Contract Document");
    }
}