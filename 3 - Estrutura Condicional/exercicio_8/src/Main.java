import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double tax; 
		
		double salary = sc.nextDouble(); 
		
		if(salary <= 2000.00) {
			tax = 0.0; 
		}
		else if(salary <= 3000.00){
			tax = (salary - 2000.00) * 0.08; 
		}
		else if(salary <= 4500.00) {
			salary = salary - 3000.00; 
			tax = (1000 * 0.08) + salary * 0.18; 
		}
		else {
			salary = salary - 4500.00;
			tax = (1000 * 0.08) + (1500 * 0.18) + salary * 0.28;
		}
		
		
		
		if(tax == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n ", tax);
		}
		
		
		sc.close();
	}

}
