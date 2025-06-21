package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Entre com o nome do funcionário:");
			String nome = sc.nextLine();
			System.out.println("Entre com o valor por hora:");
			double valorHora = sc.nextDouble();
			System.out.println("Entre com a quantidade de horas trabalhadas:");
			int quantHoras = sc.nextInt();
			
			double pagamento = valorHora * quantHoras;
			
			System.out.println("Nome: "+ nome);
			System.out.printf("Valor por hora:%.2f\n ", valorHora);
			System.out.println("Horas trabalhadas: "+ quantHoras);
			System.out.printf("O pagamento para %s deve ser %.2f\n", nome,pagamento);

		
			sc.close();

	}

}
