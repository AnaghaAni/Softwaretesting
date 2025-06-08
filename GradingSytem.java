package gradingsystem;

public class GradingSytem 
{
	public static void main(String args[])
	{
			// Accept three inputs from students
			
			int markMath = 98 ;
			int markSci = 76;
			int markEng =40 ;
			
		
		
			// calculate the average
			
			int totalMark = markMath + markSci + markEng ;
			float avgMark = totalMark / 3.0f ;
			
			System.out.println("Average of three subjects : "+avgMark);
			
			
			// based on average printing the grades
			
			if(avgMark >= 90 && avgMark <= 100)
			{
				System.out.println("Grade : A+");
				System.out.println("Excellent");
			}
				
			else if(avgMark >= 75 )
			{
				System.out.println("Grade : A");
				System.out.println("Excellent");
			}
			
			else if(avgMark >= 60 )
			{
				System.out.println("Grade : B");
				System.out.println("Keep improving");
			}
			else if(avgMark >= 40 )
			{
				System.out.println("Grade : C");
				System.out.println("Keep improving");
			}
			else 
			{
				System.out.println("Grade : F");
				System.out.println("Please work harder next time");
			}
			

			//check if any subject mark is <35
			
			if( markMath < 35 || markSci < 35 || markEng <35)
				System.out.println("Failed due to low score in at least one subject");
			
			
		}
}
			
			

		
		
		
		
