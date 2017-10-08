import java.util.Scanner;
//problem 1
public class assignment1 {
	
	public static void main(String[]args) {
		//take user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert Hour:");
		int h = scan.nextInt();
		System.out.print("Insert Min:");
		int m = scan.nextInt();
		System.out.print("Insert 1 for am, 2 for pm:");
		int ap = scan.nextInt();
		
		//use method
		time(h,m,ap);
		
		scan.close(); 
	}

	public static void time(int hour, int min, int ampm) {
		
		//conditionals for leading zeros in AM time
		if(ampm == 1) {
			if(hour <= 9 && min <= 9) {
			
			System.out.println("0" + hour + ":" +"0"+ min);
			}
			else if(hour>=10 && min>=10){
				System.out.println(hour + ":" + min);
			}
			else if(hour>=10 && min<=9) {
				System.out.println(hour + ":" + "0"+min);
			}
			else if(hour <= 9 && min >= 10) {
				System.out.println("0"+hour + ":" + min);
			}
		}
		//printing PM teims
		else if(ampm == 2 ){
			hour = hour+12;

			if(min>=9) {
				System.out.println(hour + ":" + min);
			}
			else if(min<=10) {
				System.out.println(hour + ":" + min);
			}
		}
	}	  	
}
	