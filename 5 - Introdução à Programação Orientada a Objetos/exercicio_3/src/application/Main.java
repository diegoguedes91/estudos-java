package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student(); 
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.final_grade());
		
		if(student.final_grade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missing());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
