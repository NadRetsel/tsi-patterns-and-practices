package structural_patterns.adapter_exercise;

public class Adult {

    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hi, I'm " + name + ", and I'm " + age + " years old!";
    }

}
