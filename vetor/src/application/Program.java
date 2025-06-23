package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Fazer um programa para ler um numero inteiro N e a altura
		//de N pessoas.Armazene as N alturas em um vetor.Em seguida,
		//mostrar a altura média dessas pessoas.

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		int number = sc.nextInt();
		double[] vect = new double[number];
		
		for(int i= 0; i < number; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < number; i++ ){
			sum += vect[i];
		}
		
		double avg = sum / number;
		
		System.out.printf("Average height: %.2f%n" , avg);
		
		
		
		
		sc.close();
	}

}
