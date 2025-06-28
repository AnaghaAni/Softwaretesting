package Abstraction;


interface Drawable
{
	int a =10;//all the instance var are public static final
	default  void draw()
	 {
		int b =10;
		 System.out.println(" Drawing  shapes"+b);
	 }
}

interface Coloring
{
	default void draw()
	 {
		 System.out.println(" Drawing shapes with color");
	 }
}

class Rectangles implements Drawable, Coloring
{
	// so by default the access modifier is default
	//so we need to mention it as public
	 public  void draw()
	{
		System.out.println(" Drawing and coloring  Rectangle");
		 Drawable.super.draw();
		 Coloring.super.draw();
		 System.out.println(Drawable.a +2);
	}
	 
	 public void show()
		{
			System.out.println(" showing");
			System.out.println(Drawable.a);
			System.out.println(Drawable.a);
		}
}


public class UnderstandingInterfaces 
{

	public static void main(String[] args)
	{
		
		Drawable d = new Rectangles();
		d.draw();
		
		Rectangles r = (Rectangles)d;
		r.show();
		
	
	}

}

