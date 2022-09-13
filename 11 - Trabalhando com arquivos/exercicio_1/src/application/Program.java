package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter fila path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		// Esta pasta foi criado no Windows, para linux seria "/out"
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		// Para linux criar "/out/sammary.csv"
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(","); 
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for(Product item: list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED");
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		}
		catch(IOException e ) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}

}
