package application;

import java.util.Scanner;

import entities.RoomRent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		
		RoomRent[] vect = new RoomRent[10];
		
		System.out.println();
		
		for(int i = 0; i < rent; i++) {
			
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new RoomRent(name, email);
			System.out.println();
		}
		
		System.out.print("Busy rooms: \n");
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
			
		}
		
		
		sc.close();
	}

}
