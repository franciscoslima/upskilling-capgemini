package list02.adapter.bankCardReader;

public class OldCardReaderAdapter  implements CardReader {

    private OldCardReader oldCardReader;

    public OldCardReaderAdapter(OldCardReader oldCardReader) {
        this.oldCardReader = oldCardReader;
    }

    @Override
    public void readData(String data) {
        System.out.println("Adapting old card reader to read data.");
        oldCardReader.readMagneticStripe(data);
    }
}
