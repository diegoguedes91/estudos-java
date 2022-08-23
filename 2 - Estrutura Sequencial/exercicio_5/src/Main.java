import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int piece_code1, number_of_pieces1, 
			piece_code2, number_of_pieces2; 
		
		double unitary_value1, unitary_value2, amount_paid;
		
		piece_code1 = sc.nextInt();
		number_of_pieces1 = sc.nextInt();
		unitary_value1 = sc.nextDouble();
		
		piece_code2 = sc.nextInt();
		number_of_pieces2 = sc.nextInt();
		unitary_value2 = sc.nextDouble();
		
		amount_paid = number_of_pieces1 * unitary_value1 + number_of_pieces2 * unitary_value2; 
		
		System.out.printf("VALOR A PAGAR R$ %.2f%n", amount_paid);
		
		sc.close();
	}

}
