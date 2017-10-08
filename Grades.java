package assignment1;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		//print the list of students yee.
		studentList();
	}
	
	public static void studentList() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of Students: ");
		//set the size of the array
		int classSize = scan.nextInt();
		
		//virtual file cabinets.(basically)
		int grade[] = new int[classSize];
		String student_name[] = new String[classSize];
		
		// "i" should work anywhere 
		int i = 0;
		for (i = 0; i < classSize; i++) {
			System.out.print("Student Name & grade: ");
			//make files and put in cabinet
			student_name[i] = scan.next();
			grade[i] = scan.nextInt();
			
		}	
		//loop the times prints are needed
		for (i = 0; i < classSize; i++) {
			System.out.printf("%-10.10s %03d \n",student_name[i], grade[i]);
		}
			scan.close();
	}
}

