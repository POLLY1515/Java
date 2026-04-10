package Exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		//Crie uma variável nome e imprima “Olá, [seu nome]!”.
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "Poliana";
		
		System.out.println("Olá , " + nome + "!");
		
		/*===========================================================*/
		//Crie um vetor com as notas 7.5, 8.0, 9.5 e calcule a média.
		
		double[] vect  = new double[3];
		vect[0] = 7.5;
		vect[1] = 8.0;
		vect[2] = 9.5;
		
		double media = vect[0] + vect[1] + vect[2] / 3;
		
		System.out.println("Media: " + media);
		
		
		
		
	}

}
