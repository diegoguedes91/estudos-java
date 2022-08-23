package application;

import java.util.Scanner;

import entities.RegistrationOfPeople;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt(); 
		
		RegistrationOfPeople[] vect = new RegistrationOfPeople[n];
		
		int sumAge = 0;
		String nameOldAge = "";
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " +  (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			vect[i] = new RegistrationOfPeople(name, age);
			
			if(vect[i].getAge() > sumAge) {
				sumAge = vect[i].getAge(); 
				nameOldAge = vect[i].getName();
			}
			
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nameOldAge);
		
		sc.close();
	}

}
