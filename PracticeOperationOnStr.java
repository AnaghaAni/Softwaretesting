package StringPractice;
import java.util.*;

public class PracticeOperationOnStr {

	public static void main(String[] args) {
		int    i, i1, i2;
        float  f;
        double d;
        String s1, s2;

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter integer        : ");
        i  = sc.nextInt();

        System.out.print("Enter integer 1      : ");
        i1 = sc.nextInt();

        System.out.print("Enter integer 2      : ");
        i2 = sc.nextInt();

        System.out.print("Enter float          : ");
        f  = sc.nextFloat();

        System.out.print("Enter double         : ");
        d  = sc.nextDouble();


        sc.nextLine();

        System.out.print("Enter String 1       : ");
        s1 = sc.nextLine();

        System.out.print("Enter String 2       : ");
        s2 = sc.nextLine();
        
        System.out.println("\nValues  entered");
        System.out.println("i  = " + i);
        System.out.println("f  = " + f);
        System.out.println("d  = " + d);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
        
        System.out.println("\nSingle int arithmetic on i:");
        System.out.println("i  + 1 = " + (i  + 1));
        System.out.println("i  - 1 = " + (i  - 1));
        System.out.println("i  * 2 = " + (i  * 2));
        System.out.println("i  / 2 = " + (i  / 2));
        
        System.out.println("\nArithmetic with i1 & i2:");
        System.out.println("i1 + i2 = " + (i1 + i2));
        System.out.println("i1 - i2 = " + (i1 - i2));
        System.out.println("i1 * i2 = " + (i1 * i2));
        System.out.println("i1 / i2 = " + (i1 / i2));

        System.out.println("\nConcatenated strings:");
        System.out.println(s1 + s2);
        
	}

}
