package creational_patterns.builder_example;

public class Computer {
    private String CPU;
    private String GPU;
    private String RAM;
    public Computer() {}

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void getInfo() {
        String toPrint = "RAM: " + this.RAM;
        toPrint += "\nCPU: " + this.CPU;
        toPrint += "\nGPU: " + this.GPU;

        System.out.println(toPrint);
    }
}
