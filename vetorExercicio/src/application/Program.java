package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro N e os 
		 * dados(nome e preço) de N Produtos. Armazene os N 
		 * produtos  em um vetor. Em seguida, mostrar o preço 
		 * médio dos produtos.
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the product name:");
			sc.nextLine();//para quebra de linha nao ficar pendente
			String name = sc.nextLine();
			System.out.print("Enter the price of the product");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++ ) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;
		
		System.out.printf("Average price = %.2f%n", avg);
	}

}
