import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt(); 
		
		for(int i = 0; i <= n; i++) {
			
			double x1 = sc.nextDouble(); 
			double x2 = sc.nextDouble();
			
			if(x2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = x1 / x2; 
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}

}
