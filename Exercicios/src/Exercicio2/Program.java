package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Entre com o valor de r:");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("Area = %.3f\n", area);
		
		sc.close();

	}

}
