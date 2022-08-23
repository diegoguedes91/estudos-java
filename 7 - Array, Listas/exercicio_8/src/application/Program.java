package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt(); 
		
		int[] vect = new int[n];
		
		double sum = 0.0;
		int nSum =0;
		for(int i =0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = number; 
			
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				nSum++;
			}
			
		}
		
		
		if(sum == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double average = sum / nSum;
			System.out.printf("MEDIA DOS PARES = %.1f", average);
		}
		
		
		
		sc.close();
	}

}
