package lt.verbus;

public abstract class Deciduous implements Tree {
    @Override
    public void describe() {
        System.out.println("   - " + this.toString() + " has leaves.");
    }
}
