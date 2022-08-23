import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1, number2, sum; 
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		sum = number1 + number2;
		
		System.out.println("SOMA = " + sum);
		
		sc.close();
	}

}
