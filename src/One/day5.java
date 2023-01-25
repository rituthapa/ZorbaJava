package One;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// writing conditions in a clear way using switch case break default
		// same like if else if, switch case break with also give multiple outputs from single input but just in more cleaner way
		String month = "august";
		switch (month) {
		case "december":
		case "january":
		case " february":
			System.out.println("winter");
			break;
		case "march":
		case "april":
			System.out.println("spring");
			break;
		case "may":
		case "june":
		case "july":
				System.out.println("summer");
				break;
		case "august":
		case "september":
		case "october":
		case "november":
			System.out.println("fall");
			break;
			default:
				System.out.println("not a month");
		}
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("sunday");
		case 2:
			System.out.println("monday");
		case 3:
			System.out.println("tuesday");
		case 4:
			System.out.println("wednesday");
		case 5:
			System.out.println("thursday");
		case 6:
			System.out.println("friday");
		case 7:
			System.out.println("saturday");
			default:
				System.out.println("not day of a week");
		}
		//using break
				int days = 1;
				switch (days) {
				case 1:
					System.out.println("sunday");
					break;
				case 2:
					System.out.println("monday");
					break;
				case 3:
					System.out.println("tuesday");
					break;
				case 4:
					System.out.println("wednesday");
					break;
				case 5:
					System.out.println("thursday");
					break;
				case 6:
					System.out.println("friday");
					break;
				case 7:
					System.out.println("saturday");
					break;
					default:
						System.out.println("not day of a week");
				}
				
				// multiple case  can have same output
				
				String city = "dallas";
				switch (city) {
				case "dallas":
				case "austin":
					System.out.println("TX");
					break;
				case "boulder":
				case "frederick":
				case"colorado springs" :
					System.out.println("CO");
					break;
					default:
						System.out.println("not a city name");
				}
		}
	}


