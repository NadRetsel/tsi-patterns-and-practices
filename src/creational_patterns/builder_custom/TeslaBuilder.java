package creational_patterns.builder_custom;

public class TeslaBuilder extends CarBuilder {

    public CarBuilder SetBrand()
    {
        car.SetBrand("Tesla");
        return this;
    }
    public CarBuilder SetModel()
    {
        car.SetModel("X");
        return this;
    }
    public CarBuilder SetType()
    {
        car.SetType("SUV");
        return this;
    }
    public Car GetCar()
    {
        return car;
    }

}
