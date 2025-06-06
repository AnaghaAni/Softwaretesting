package myprj;

public class Logical {

	public static void main(String[] args) {
	int a=2;
	int b=3;
	int c=5;
	
	System.out.println("And operation :" +((b>a) &&(b>c)));
	System.out.println("OR operation :" +((b>a) || (b>c)));
	System.out.println("Not operation :" +(!(b>c)));
	}

}
