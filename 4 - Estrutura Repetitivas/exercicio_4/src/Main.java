import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt(); 
		
		for(int i = 0; i <= number; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
