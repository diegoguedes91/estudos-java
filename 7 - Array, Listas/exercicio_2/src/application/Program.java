package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorNumbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		
		int n = sc.nextInt();
		VectorNumbers[] vect = new VectorNumbers[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = new VectorNumbers(number);
			
		}
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i].getNumber());
		}
		
		System.out.println();
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getNumber(); 
		}
		
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f", sum/vect.length);
		
		sc.close();
	}

}
