package creational_patterns.builder_example;

public class GamingPCBuilder extends PCBuilder {

    @Override
    public void buildCPU() {
        computer.setCPU("i9 10770k");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("RTX 4070");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB DDR4 (anything more is excessive)");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
