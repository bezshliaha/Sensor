package app;

public class ColorObserver extends Observer {
    public ColorObserver(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    public void update() {
        System.out.println("Substance color: " + substance.getColor());
    }
}
