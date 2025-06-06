package calculatingmarks;

public class CalculatingMarks {
	public static void main(String args[]) 
	{
		//Store marks of 3 subjects: Math, Science, and English
		 int mathMark = 85;
		 int sciMark = 92 ;
		 int engMark = 95 ;
		 System.out.println("Marks " );
		 System.out.println(" Maths:" +mathMark);
		 System.out.println(" Science:" +sciMark);
		 System.out.println(" English:" +engMark);
		 
		 // Calculating total marks
		 
		 int totalMark = mathMark + sciMark + engMark ;
		 
		 //Calculating average
		  
		 int avgMark = totalMark / 3;
		 
		 //Printing Average and total
		 
		 System.out.println("\nTotal Marks :" +totalMark);
		 System.out.println(" Average Marks :" +avgMark);
		 
		 // change the data type of average
		 
		 float avgMarks = totalMark / 3.0f;
		 System.out.println("\n After changing the datatyoe of Average Marks :" +avgMarks);
		
	}
	

}
