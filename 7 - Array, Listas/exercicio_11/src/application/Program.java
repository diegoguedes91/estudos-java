package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PeopleData;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt(); 
		
		PeopleData[] vect = new PeopleData[n]; 
		
		double shorterHeight = 3.0; 
		double greatestHeight = 0.0;
		double sum = 0.0;
		int sumF = 0;
		int sumM = 0; 
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double height = sc.nextDouble(); 
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			char genre = sc.next().charAt(0); 
			
			vect[i] = new PeopleData(height, genre);
			
			// menor altura
			if(vect[i].getHeight() < shorterHeight) {
				shorterHeight = vect[i].getHeight();
			}
			
			// maior altura
			if(vect[i].getHeight() > greatestHeight) {
				greatestHeight = vect[i].getHeight();
			}
			
			// soma a altura das mulheres e quantidade de mulheres
			if(vect[i].getGenre() == 'F') {
				sum += vect[i].getHeight(); 
				sumF++; 
			}
			else {
				sumM++; // soma a quantidade de homens
			}
			
		}
		
		double average = sum / sumF; 
		
		System.out.printf("Menor altura = %.2f%n", shorterHeight);
		System.out.printf("Maior altura = %.2f%n", greatestHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", average);
		System.out.println("Numero de homens = " + sumM);
		
		sc.close();
	}

}
