package method;


public class BlockScope {
    int sumout;                       // (1) instance variable, default 0

    public static void main(String[] args) {
        BlockScope bs = new BlockScope();
        System.out.println(bs.sumout);   // prints 0

        int x = 10;                      // (2) local variable
        if (x == 10) {                   // start of IF block
            int temp = ++x;              // (3) temp in block scope
            System.out.println("Temporary variable: " + temp);
        }                                // temp is gone here
        
		//		System.out.println("Temporary variable:"+temp); Error: temp not in scope here
        
        System.out.println("x variable: " + x); // x is still 11

        for (int i = 0; i < 10; i++) {   // i has loop‑block scope
            int sum = 0;                 // new sum each iteration
            sum += i;
            System.out.println(sum);
            System.out.println(i);
        }                                // i and sum are out of scope here
        
		//		System.out.println(sum);
		//		System.out.println(i);
				
		//		both s and i are local variables
    }
}

