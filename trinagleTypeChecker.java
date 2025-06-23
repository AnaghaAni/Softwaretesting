package triangletypechecker;

public class trinagleTypeChecker {
	public static void main(String args[])
	{
		// sides of a triangle
		
		int side1 = 4;
		int side2 = 4;
		int side3 = 4;
		
		//print the sides
		System.out.println("Sides of a triangle are:");
		System.out.println(side1);
		System.out.println(side2);
		System.out.println(side3);
		
		//check if the sides are valid ,if yes then only it can be valid
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
		{
			//Finding the type of triangle
			if(side1 == side2 && side2 == side3)
				System.out.println("Equilateral triangle");
			
			else if(side1 != side2 && side2 != side3 && side1 != side3)
				System.out.println("Scalene triangle");
			
			else if(side1 == side2 || side2 == side3 || side1 == side3)
				System.out.println("Isosceles traingle");
		}

		// sides are valid
		else
		{
			System.out.println("No, it is not a triangle");
		}
		
		
	}

}
