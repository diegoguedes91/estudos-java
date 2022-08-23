package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorNumbers;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		
		int n = sc.nextInt();
		VectorNumbers[] vect = new VectorNumbers[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt(); 
			vect[i] = new VectorNumbers(number);
		}
		
		System.out.println("NUMERO NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		sc.close();
	}

}
