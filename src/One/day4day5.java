package One;

public class day4day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if (condition){statements}

		int marks = 87;
		if (marks >= 90) {
			System.out.println("grade A");
		}
		if (marks >= 70 && marks < 90) {
			System.out.println("grade B");
		}
		if (marks < 70) {
			System.out.println("grade C");
		}

		int score = 92; // if, if, if tests all three conditions
		if (score >= 90) {
			System.out.println("grade A");
		}
		if (score >= 70) {
			System.out.println("grade B");
		}
		if (score > 60) {
			System.out.println("grade C");
		}

		// now using if, else if, else if, if one condition is true, it will not move to
		// next condition
		// move to next condition only if previous condition is false

		if (score >= 90) {
			System.out.println("grade A");
		} else if (score >= 70) {
			System.out.println("grade B");
		} else if (score > 60) {
			System.out.println("grade C");
		} else {
			System.out.println("fail");
		}

		int cost = 100;
		System.out.println(cost-(cost*discount(cost)/100));
		discount(1);

	}

	static int discount(int numT) {
		int discountPercent = 0;
		if (numT < 5) {
			System.out.println("no discount");
			discountPercent =0;
		} else if (numT >= 5 && numT < 10) {
			System.out.println("10% discount");
			discountPercent = 10;
		} else if (numT >= 10) {
			System.out.println("20% discount");
			discountPercent = 20;

		}
		return discountPercent;
	}
}
