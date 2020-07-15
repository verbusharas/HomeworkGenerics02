package lt.verbus;

public abstract class Coniferous implements Tree {
    @Override
    public void describe() {
        System.out.println("   - " + this.toString() + " has spikes.");
    }
}
