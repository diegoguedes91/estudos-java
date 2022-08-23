package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt(); 
		
		int[] a = new int[n]; 
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor A");
		for(int i = 0; i < n; i++) { 
			int number = sc.nextInt();
			a[i] = number; 
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i = 0; i < n; i++) { 
			int number = sc.nextInt();
			b[i] = number; 
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < n; i++) { 
			int number = a[i] + b[i];
			c[i] = number;
			System.out.printf("%d%n", c[i]);
		}

		
		sc.close();
	}

}
