package list01.builder.computer;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        computer = new Computer();
        computer.setHasCooler(true);
    }

    public ComputerBuilder cpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder gpu(String gpu){
        computer.setGpu(gpu);
        return this;
    }

    public ComputerBuilder ram(String ram){
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder motherBoard(String motherBoard){
        computer.setMotherBoard(motherBoard);
        return this;
    }

    public Computer build(){
        return computer;
    }
}
