
public class Car {
	double eff;
	double fuel = 0;
	
	public Car(double eff)
	{
		this.eff = eff;
	}
	
	public double drive()
	{
		int km = 0;
		while (fuel > 0)
		{
			fuel -= eff;
			km++;
		}
		return km;
	}
	
	public double getGasInTank() 
	{
		return fuel;
	}
	
	public void addGas() 
	{
		fuel += 200;
	}
	

}
