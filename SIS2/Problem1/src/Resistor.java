
public class Resistor extends Circuit {
    private double r;
    private double potentialDifference;
        
    public Resistor(double r) {
        this.r = r;
    }

    public double getResistance() {
        return r;
    }
        
    public double getPotentialDiff() {
        return potentialDifference;
    }
        
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
    }
}