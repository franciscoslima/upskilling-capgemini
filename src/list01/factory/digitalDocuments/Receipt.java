package list01.factory.digitalDocuments;

public class Receipt implements Document {
    @Override
    public void sign() {
        System.out.println("Signing Receipt Document");
    }
}
