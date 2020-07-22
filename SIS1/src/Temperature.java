import java.util.Scanner;
public class Temperature {
	private double temp;
	private char scale;
	
	public Temperature (double temp)
	{
		this.temp = temp;
	}
	
	public Temperature (char scale)
	{
		this.scale = scale;
	}
	
	public Temperature (double temp, char scale)
	{
		this.temp = temp;
		this.scale = scale;
	}
	
	public Temperature ()
	{
		this.temp = 0;
		this.scale = 'C';
	}
	
	public double Celsius()
	{
		if (scale == 'C')
	    		return temp;
	    else
	    		return 5*(temp - 32)/9;
	}
	
	public double Fahrenheit()
	{
		if (scale == 'F')
			return temp;
		else
			return 9*(temp/5) + 32;
	}
	
	public char getScale()
	{
		return scale;
	}
	
	

}
