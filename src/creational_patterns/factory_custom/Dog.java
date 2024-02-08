package creational_patterns.factory_custom;

public class Dog implements Animal
{
    private boolean tail_wagging;
    public void MakeNoise()
    {
        System.out.println("Woof!");
    }

}
