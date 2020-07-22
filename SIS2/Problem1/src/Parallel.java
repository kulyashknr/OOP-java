
public class Parallel extends Circuit {
    public Circuit a;
    public Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }
        
    public double getResistance() {
        double R1 = a.getResistance();
        double R2 = a.getResistance();
        return 1.0 / ((1.0/R1) + (1.0/R2));
    }
        
    public double getPotentialDiff() {
        if (a.getPotentialDiff() != b.getPotentialDiff())
        {
            System.out.print("Error");
            return 0;
        }
        return a.getPotentialDiff();
    }
                
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
