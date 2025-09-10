package list02.adapter.printers;

public class PrinterAdapter implements NewPrinter {

    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(String text) {
        System.out.println("Using printer adapter.");
        oldPrinter.print(text);
    }
}
