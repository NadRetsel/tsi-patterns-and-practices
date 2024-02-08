package creational_patterns.builder_custom;

public class Car {
    private String brand;
    private String model;
    private String type;

    public void SetBrand(String brand)
    {
        this.brand = brand;
    }
    public void SetModel(String model)
    {
        this.model = model;
    }
    public void SetType(String type)
    {
        this.type = type;
    }

    public String OutputInfo()
    {
        String output = "Brand: " + this.brand;
        output += "\nModel: " + this.model;
        output += "\nType: "  + this.type;

        return output;
    }

}
