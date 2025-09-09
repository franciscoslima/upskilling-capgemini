package list01.factory.digitalDocuments;

public class App {
    public static void main(String[] args) {
        Document invoice = new DocumentFactory().getDocument("invoice");
        Document receipt = new DocumentFactory().getDocument("receipt");
        Document contract = new DocumentFactory().getDocument("contract");

        invoice.sign();
        receipt.sign();
        contract.sign();
    }
}
