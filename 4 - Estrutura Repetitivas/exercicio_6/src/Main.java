import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x1 = 0.0, x2 = 0.0, x3 = 0.0, media = 0.0; 
		
		for(int i = 0; i <= n; i++) {
			
			x1 = sc.nextDouble();
			x2 = sc.nextDouble(); 
			x3 = sc.nextDouble();
			
			media = (x1 * 2 + x2 * 3 + x3 * 5) / (2 + 3 + 5); 
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
