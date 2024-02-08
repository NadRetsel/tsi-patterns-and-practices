package creational_patterns.builder_custom;

 abstract public class CarBuilder {
    protected Car car = new Car();
    public abstract CarBuilder SetBrand();
    public abstract CarBuilder SetModel();
    public abstract CarBuilder SetType();
    public abstract Car GetCar();
}
