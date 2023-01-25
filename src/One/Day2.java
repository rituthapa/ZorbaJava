package One;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int s = 8;
	    int t = 10;
	    int q= s + t;
	    
	    System.out.println(q+q);
	    
	    		
		// 10 pairs 50 lines is impossible so write a function/method
	    
	    // calling the function by its name inside main method for output
	    
	    calculator (12, 13);
	    
	    
	    // calling second function 
		CalA();
		CalA();
		
		//calling another function
		CalB(20,50);
		
		/* calling funtion but also storing the return value to a variable type (int ra) 
		* here ra = the function(integer (or any other type) values that has already been defined inside main method)
				*/
		int ra=CalC(s,t);
		System.out.println(ra);
		
		int rb= subs(q,s);
		System.out.println(rb);
		
		int rc= mult(9,10);
		System.out.println(rc);
		
		int rd= div(ra,rb);
		System.out.println(rd);
		System.out.println(rd*0.25);// 25% of rd
		System.out.println(rd + 10);
		System.out.println(rd*2);
		
		
		// call the dog function where b=2 and c=3
		
		int b=2;
		int c=3;
		
		int re= dog(b,c);
		System.out.println(re);
		
	}
	
	
	static void calculator (int x, int y) {
		// (intx,inty) is parameter
		System.out.println(x+y);	
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		System.out.println(x%y);
		
	}
	
	//function without parameter and without return // void means not returning anything
	
	
	static void CalA() {
		System.out.println(9+9);	
	System.out.println();
	}
	
	
	// function with parameter and without return type
	
	static void CalB(int x, int y) {
		System.out.println(x+y);
	}
	
	// function with parameter and with return type
	
	static int CalC(int x, int y) {
		return x + y;
	}
	
	static int subs (int x, int y) {
	      return (x-y);	
	}
	
	static int mult (int x, int y) {
		return (x*y);
	}
	
	static int div (int x, int y) {
		return x/y;
	}
		
	// write a function that returns value of (a + b)^2
	
	static int dog(int a, int b) {
	    return (a*a + 2*a*b + b*b); // or the formula is Math.pow(a,2) - 2 * (a * b) + Math.pow(b,2) // stackoverflow to google 
	}
	
	
	}


