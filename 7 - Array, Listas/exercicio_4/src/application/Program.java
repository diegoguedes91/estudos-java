package application;

import java.util.Scanner;

import entities.VectorNumber;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt(); 
		
		VectorNumber[] vect = new VectorNumber[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new VectorNumber(number);
			
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int sum = 0;
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i].getNumber() % 2 == 0) {
				System.out.print(vect[i].getNumber() + " ");
				sum += 1;
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + sum);
		
		sc.close();
	}

}
