package oops;

class Rectangle
{
	int length ;
	int breadth ;
	Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
	
	int area ()
	{
		
		return length * breadth ;
	}
	
}

public class Area {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(60,30);
		int area = r.area();
		System.out.println("Area of Rectagle with "+ r.length +" and "+ r.breadth+" is "+area);
		
	}

}
