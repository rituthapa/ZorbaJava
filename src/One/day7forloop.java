package One;

public class day7forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop
		// for (initialization;conditioncheck;increment/decrement) {
		// System.out.println("hello");
		// }

		for (int i = 1; i <= 3; i++) { // i++ also can be written as i=i+1 but i++ is short version to increase
										// valueby1
			System.out.println(i);
			System.out.println("hello");
		}

		for (int x = 4; x >= 1; x--) { // 4,3,2,1 true, when x=0, condition is false, comes out of loop
			System.out.println(x); // 4, 3, 2, 1
		}

		for (int a = 2; a <= 10; a = a + 2) { // basically, this will print 2 to 10 ie, table of 2 upto 10
			System.out.println(a);
		}
		
		for (int b=5; b<=25; b=b+5) { // prints table of 5 upto 25
			System.out.println(b);
		}
		
		// break condition with for loop
		for (int y=0; y<=3; y++ ) {
			System.out.println(y);   // print 0, 1, 2, then breaks at 2==2 is true
			if (y==2) {
			break;
			}
		}
		
		for (int y=0; y<=3; y++ ) {
			if (y==2) {
			break;
			}
			System.out.println(y); //print 0, 1 then break st 2==2 is true then end of loop so 2 with not print
		}
		
		//continue condition with for loop
		
	for (int z=20;z>=14; z=z-2) {
		System.out.println(z);
		if (z==16) {
			continue;   // no change // no use of continue// because sys out before continue so print 16 also
		}
	}
	
	for (int z=20; z>=14; z=z-2) {
		if (z==16) {
			continue;
		}
		System.out.println(z); // print all but skip 16 because when 16==16 is true, it'll continue and go to next increment without printing it
		}
	}

}
