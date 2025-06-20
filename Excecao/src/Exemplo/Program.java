package Exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program!");

	}
	
	public static void method1() {
		System.out.println("Method1 start");
		method2();
		System.out.println("Method1 end");

	}
	

	public static void method2() {
		System.out.println("Method2 start");
Scanner sc = new Scanner(System.in);
		
		try {
			//vetor de string , le uma posicao e depois mostra o vetor na posicao
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");		
			e.printStackTrace();//Inprime na tela o rastreamento do stack
			sc.next();
		}
			
			catch (InputMismatchException e) {
				System.out.println("Input error");			
				}
		System.out.println("Method2 end");
		
		sc.close();
	}
}
