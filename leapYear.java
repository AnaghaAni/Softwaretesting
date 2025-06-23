package leapyear;

public class leapYear {

	public static void main(String[] args) {
		int year = 2000 ;
		
		if(( (year % 4 == 0 ) && (year % 100 !=0) ) || year % 400 ==0)
			System.out.println("The " + year +" you mentioned is leap year !");
		else
			System.out.println("The " + year +" you mentioned is not aleap year !");
		

	}

}


