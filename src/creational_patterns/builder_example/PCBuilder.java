package creational_patterns.builder_example;

abstract public class PCBuilder {
    protected Computer computer = new Computer();
    public abstract void buildCPU();
    public abstract void buildGPU();
    public abstract void buildRAM();
    public abstract Computer getResult();
}
