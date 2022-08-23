package entities;

public class Students {

	private String name; 
	private double grade1; 
	private double grade2;
	
	public Students(String name, double grade1, double grade2) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	} 
	
	
	
}
