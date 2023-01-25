package One;

public class practiceday10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int y = 10;

		if (x > y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("y is greater");
		}
		for (int a = 50; a >= 5; a = a - 5) {
			System.out.println(a);
		}

		sum();
		difference(8,7);
		int d= division(60,10);
		System.out.println(d);
		System.out.println(d*9);
	}

// function without paramete and no return type

	static void sum() {
		System.out.println(8 + 7);
	}
	
	// function with parameter and no return type
	
	static void difference(int x, int y) {
		System.out.println(x-y);
	}
	
	//function with parameter and with return type
	
	static int division(int a, int b) {
		return a/b;
	}
}