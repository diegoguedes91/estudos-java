package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt(); 
		
		Students[] vect = new Students[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine(); 
			String name = sc.nextLine(); 
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble(); 
			
			vect[i] = new Students(name, grade1, grade2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < vect.length; i++) {
			
			if((vect[i].getGrade1() + vect[i].getGrade2()) / 2 >= 6.0) {
				System.out.println(vect[i].getName());
			}
			
		}
		
		sc.close();
	}

}
