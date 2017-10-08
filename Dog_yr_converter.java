package assignment1;

import java.util.Scanner;

public class Dog_yr_converter {

	public static void main(String[] args) {
		//receives user's input
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert Dog's age:");
		int dy = scan.nextInt();
		System.out.print("In Human Years, that is ");
		System.out.print(dogyrs(dy));
		
		scan.close();
	}
	
	//hYr = human year, dyr = dog year
	public static int dogyrs(int dyr) {
		int hYr = 0;
		
		if (dyr == 1) {
			hYr = 14;
			System.out.print(hYr);
		}
		else if (dyr == 2){
			hYr = 22;
			System.out.print(hYr);
			}
		else {
			hYr = 22;
			for(int i = 3;i<=dyr; i++) {
				hYr = hYr + 5;
				}
		}
		return hYr;
	}
}


