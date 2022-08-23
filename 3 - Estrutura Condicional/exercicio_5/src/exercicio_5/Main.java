package exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		int code, quantity;
		double pay; 
		
		code = sc.nextInt();
		quantity = sc.nextInt();
		
		if(code == 1) {
			pay = quantity * 4.00; 
		}
		else if(code == 2) {
			pay = quantity * 4.50;
		}
		else if(code == 3) {
			pay = quantity * 5.00;
		}
		else if(code == 4) {
			pay = quantity * 2.00;
		}
		else {
			pay = quantity * 1.50; 
		}
		
		System.out.printf("Total: R$ %.2f%n", pay);
		
		sc.close();
	}

}
