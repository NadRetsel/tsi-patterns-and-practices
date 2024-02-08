package structural_patterns.adapter_exercise;

public class Pensioner {
    String name;
    int age;

    public Pensioner(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getInfo() {
        return "I'm " + name + ". I'm " + age + " years young.";
    }
}
