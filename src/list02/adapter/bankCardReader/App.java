package list02.adapter.bankCardReader;

public class App {
    public static void main(String[] args) {
        CardReader oldCardReader = new OldCardReaderAdapter(new OldCardReader());
        CardReader chipCardReader = new ChipCardReaderAdapter(new ChipCardReader());

        oldCardReader.readData("Some Magnetic Stripe Data");
        chipCardReader.readData("Some Chip Data");
    }
}
