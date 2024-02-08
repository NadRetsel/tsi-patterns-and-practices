package creational_patterns.builder_custom;

public class FordBuilder extends CarBuilder {

    public CarBuilder SetBrand()
    {
        car.SetBrand("Ford");
        return this;
    }
    public CarBuilder SetModel()
    {
        car.SetModel("F150");
        return this;
    }
    public CarBuilder SetType()
    {
        car.SetType("Light Truck");
        return this;
    }
    public Car GetCar()
    {
        return car;
    }

}