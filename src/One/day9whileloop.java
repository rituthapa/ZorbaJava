package One;

public class day9whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		
		//initialization;
		//while (conditioncheck){
        //		statement;
        //		increment/decrement;
        //	}
	
		
		// print hello 5 times using while loop
		int i = 1;
		while (i <= 5) {
			System.out.println("hello");
			i++;
		}

		// write table of 5 in reverse from 50 to 5

		int a = 50;
		while (a >= 5) {
			System.out.println(a);
			a = a - 5;
		}
		// while and break
		
		int b=8;
		while (b>=4) {
			if (b ==6) {
				break;
			}
			System.out.println(b);
			b--;
		}

		// while and continue
		
		
		int z=1;
		while (z<=5) {
			if (z==2) {
				z++; //3
				continue;
			}
			System.out.println(z); //1 //3 //4 //5
			z++; //2 //4 //5 //6 breaks the loop at 6 because while condition is false as 6<=5 is false
		}
		
		int y=25;
		while (y>=15) {
			if (y==21 || y==19) {
				y=y-2; // write increment/decrement here also to avoid infinite loop once 21 comes
				continue;
			}
			System.out.println(y);
			y=y-2; // write increment/decrement here to avoid infinite loop , or else print 25 only infinit times
		}
	}
  // this means using while and continue write both times(incre/decre above continue & incre/decre after sysout statement)
}
