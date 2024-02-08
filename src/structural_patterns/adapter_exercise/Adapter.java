package structural_patterns.adapter_exercise;

public class Adapter {
    private Pensioner pensioner;

    public Adapter(Pensioner pensioner) {
        this.pensioner = pensioner;
    }

    @Override
    public String toString(){
        return this.pensioner.getInfo();
    }
}
