import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt(); 
		
		if(number % 2 != 0) {
			System.out.println("IMPAR");
		}
		else {
			System.out.println("PAR");
		}
		
		sc.close();
	}

}
