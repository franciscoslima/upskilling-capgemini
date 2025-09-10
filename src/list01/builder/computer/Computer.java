package list01.builder.computer;

public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String motherBoard;
    private boolean hasCooler;

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", GPU='" + gpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", hasCooler=" + hasCooler +
                '}';
    }

    public void setCpu(String CPU) {
        this.cpu = CPU;
    }

    public void setGpu(String GPU) {
        this.gpu = GPU;
    }

    public void setRam(String RAM) {
        this.ram = RAM;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setHasCooler(boolean hasCooler) {
        this.hasCooler = hasCooler;
    }

    public void getConfigurations() {
        System.out.println(this);
    }
}
