package creational_patterns.builder_example;

public class OfficePCBuilder extends PCBuilder {

    @Override
    public void buildCPU() {
        computer.setCPU("i5 9000k");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("Onboard Intel Family Graphics");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("8GB DDR4");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
