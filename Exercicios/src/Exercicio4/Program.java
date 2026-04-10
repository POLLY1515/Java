package Exercicio4;

import java.util.ArrayList;
import java.util.List;
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
		
		/*===========================================================*/

		//Use ArrayList para guardar 5 nomes e depois imprimir todos com for-each.
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Poliana");
		nomes.add("Matheus");
		nomes.add("Miguel");
		nomes.add("Flavio");
		nomes.add("luiz");
		
		for (String pessoas : nomes) {
		 System.out.println("Nome: " + pessoas);	
		}
		
		
	}

}
