package entities;

public class Student {

	public String name; 
	public double grade1; 
	public double grade2; 
	public double grade3; 
	
	public double final_grade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missing() {
		return 60 - final_grade();  
	}
}
