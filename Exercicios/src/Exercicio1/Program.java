package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);


		System.out.println("Enter the first note");
		double firstNote = sc.nextDouble();
		System.out.println("Enter the second note");
		double secondNote = sc.nextDouble();
		
		double finalGrade = firstNote + secondNote;
		
		System.out.printf("Final grade: %.1f\n" , finalGrade);
 
		if(finalGrade < 60) {
			System.out.println("Disapproved");
		}

	}

}
