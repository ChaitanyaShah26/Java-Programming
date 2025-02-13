package vol;

public class Cylinder
{
	public void volume(double radius,double height)
	{
		double volume;
		final double PI=3.14;

		volume=PI*Math.pow(radius,2)*height;

		System.out.println("\nVolume of Cylinder = "+volume);
	}
}