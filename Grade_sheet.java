package assignment1;

import java.util.Scanner;

public class Grade_sheet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	

	//	System.out.print("Type the number of students");
		int size = scan.nextInt();
	//	System.out.print("Type name & grade:");
		
		int student_grades[] = new int[size];
		
		//Takes User input for number of students
		String student_name[] = new String[size];
		for (int i = 0; i < size; i++) {
			student_name[i] = scan.nextLine();
			student_grades[i] = scan.nextInt();
		}
		
		System.out.print(student_name[size]);
		System.out.print(student_grades[size]);
		
		scan.close();
	}
	public static int student_grades(int grd){
		if (grd <=99) {
			System.out.print("0"+grd+"\n");
		}
		if (grd <= 9 ) {
			System.out.print("0"+"0"+grd + "\n");
		}
		else if (grd >= 99) {
			System.out.print(grd + "\n");
		}
		return grd;
	}
	
	public static String name(String name) {
		return(name);
		
	//	printf("%10s", name);
	}
		
		}
	
		

