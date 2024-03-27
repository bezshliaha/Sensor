package app;

public class WeightObserver extends Observer {
    public WeightObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    public void update() {
        System.out.println("Substance weight, g: " + substance.getWeight());
    }
}

