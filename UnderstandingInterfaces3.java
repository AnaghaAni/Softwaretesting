package Abstraction;

interface TrignometricFunction
{
	double sine(double anglesInDegree);
	double cos(double angleInDegree);
	double tan(double angleInDegree);
}
interface Conversion
{
	double toRadians(double angleInDegree);
	double toDegree(double angleInRadians);
}

class ConverterAngle implements Conversion
{
	double angle;
	ConverterAngle(double angle)
	{
		this.angle = angle ;
	}
	
	
	public double toRadians(double angleInDegree)
	{
		return Math.toRadians(angleInDegree);
	}
	
	public double toDegree(double angleInRadians)
	{
		return Math.toDegrees(angleInRadians);
	}
}

class Trignometry extends  ConverterAngle implements TrignometricFunction
{
	double anglesInDegree;
	Trignometry(double anglesInDegree)
	{
		
		super( anglesInDegree) ;
		this.anglesInDegree = anglesInDegree;
	}
	
	public double sine(double anglesInDegree) {
		return Math.sin(super.toRadians(anglesInDegree));
	}
	
	public double cos(double anglesInDegree) {
		return Math.cos(super.toRadians(anglesInDegree));
	}
	
	public double tan(double anglesInDegree) {
		
		if(anglesInDegree % 180 == 90)
			return -1;
		return Math.tan(super.toRadians(anglesInDegree));
	}
}
public class UnderstandingInterfaces3 {

	public static void main(String[] args) {
		
		double angle = 0 ;
		Trignometry t = new Trignometry(angle);
        System.out.println("Angle in degrees: " + angle);
        System.out.println("Angle in radians: " + t.toRadians(angle));
        System.out.println("sin(" + angle + "°) = " + t.sine(angle));
        System.out.println("cos(" + angle + "°) = " + t.cos(angle));
        if(t.tan(angle) == -1)
        	 System.out.println("tan(" + angle + "°) = " + " undefined");
        else
        System.out.println("tan(" + angle + "°) = " + t.tan(angle));


	}

}
