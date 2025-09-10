package list02.adapter.printers;

public class App {
    public static void main(String[] args) {
        NewPrinter newPrinter = new PrinterAdapter(new OldPrinter());
        newPrinter.printDocument("SOME TEXT HERE");
    }
}
