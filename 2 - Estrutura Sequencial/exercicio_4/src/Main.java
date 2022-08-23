import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in); 

		int employee_number, worked_hours; 
		double hour_value, salary; 
		
		employee_number = sc.nextInt(); 
		worked_hours = sc.nextInt(); 
		hour_value = sc.nextDouble(); 
		
		salary = worked_hours * hour_value; 
		
		System.out.println("NUMBER = " + employee_number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
