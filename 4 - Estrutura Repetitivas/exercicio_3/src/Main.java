import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0; 
		int code = sc.nextInt(); 
		
		while(code != 4) {
			
			if(code == 1) {
				alcool += 1;
			}
			else if(code == 2){
				gasolina += 1;
			}
			else if(code == 3) {
				diesel += 1; 
			}
			
			code = sc.nextInt(); 
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
		
		sc.close();
	}

}
