package list02.adapter.bankCardReader;

public class ChipCardReaderAdapter implements CardReader {

    private ChipCardReader chipCardReader;

    public ChipCardReaderAdapter(ChipCardReader chipCardReader) {
        this.chipCardReader = chipCardReader;
    }

    @Override
    public void readData(String data) {
        System.out.println("Adapting chip card reader to read data.");
        chipCardReader.readChipData(data);
    }
}
