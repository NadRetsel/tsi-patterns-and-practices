package creational_patterns.factory_custom;

public class AnimalFactory
{

    public static Animal CreateDog()
    {
        return new Dog();
    }
    public static Animal CreateCat()
    {
        return new Cat();
    }

    public static void main(String[] args)
    {

        Animal dog = AnimalFactory.CreateDog();
        dog.MakeNoise();

        Animal cat = AnimalFactory.CreateCat();
        cat.MakeNoise();
    }

}
