package list01.builder.computer;

public class App {
    public static void main(String[] args) {
        Computer computerOne = new ComputerBuilder()
                .cpu("cpu One")
                .gpu("gpu One")
                .ram("ram One")
                .motherBoard("motherBoard One")
                .build();

        Computer computerTwo = new ComputerBuilder()
                .cpu("cpu Two")
                .gpu("gpu Two")
                .ram("ram Two")
                .motherBoard("motherBoard Two")
                .build();

        computerOne.getConfigurations();
        computerTwo.getConfigurations();
    }
}
