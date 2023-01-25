package One;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// comparison using boolean type true or false

		// Logical operators
		// and &&
		System.out.println(2 == 2 && 4 != 5);
		System.out.println(2 >= 2 && 4 >= 5);
		System.out.println(2 != 2 && 8 > 7);
		System.out.println(2 == 3 && 4 > 5);

		// OR ||
		
		System.out.println(2 == 2 || 4 != 5);
		System.out.println(2 >= 2 || 4 >= 5);
		System.out.println(2 != 2 || 8 > 7);
		System.out.println(2 == 3 || 4 > 5);
		
		// NOT !
		
		System.out.println(!(2==2));
		System.out.println(!(4<3));
		
		add();
		subs(35,34);
		
		int sum = addition(40, 9);
		System.out.println(sum);
		System.out.println(sum*0.10);
		System.out.println(sum / 7);
		

	}
   // without parameter and without return type
	    static void add() {
	    	System.out.println(9+45);
	    }
	// with parameter and without return type
	
	static void subs(int x, int y) {
		System.out.println(x-y);
	}
	
	// with parameter and with return type
	// difference between $100 given vs $100 shown only
	
	static int addition(int x,int y) {
		System.out.println(x+y);
		return x+y ;
	}
}
