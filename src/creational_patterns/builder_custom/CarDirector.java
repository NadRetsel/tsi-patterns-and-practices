package creational_patterns.builder_custom;

public class CarDirector {

    public static void ConstructCar(CarBuilder builder)
    {
        builder.SetBrand()
                .SetType()
                .SetType();
    }

    public static void main(String[] args)
    {

        CarBuilder builder = new TeslaBuilder();
        CarDirector.ConstructCar(builder);
        Car car = builder.GetCar();
        System.out.println(car.OutputInfo());

        System.out.println();

        builder = new FordBuilder();
        CarDirector.ConstructCar(builder);
        car = builder.GetCar();
        System.out.println(car.OutputInfo());
    }
}
