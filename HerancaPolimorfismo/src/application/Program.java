package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		//insira o numero de contribuintes
		System.out.print("Enter the numnber of tax payers:");
		int n = sc.nextInt();
		for(int i = 0; i < n; i ++) {
			System.out.println("Tax payer #" + (i +1) + " data:");
			System.out.print("legal person or natural person?(l/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Annual Income:");
			double annualIncome = sc.nextDouble();
			if(ch == 'l') {
				System.out.print("Number of Employees:");
				int employees = sc.nextInt();
				LegalPerson legalPerson = new LegalPerson(name, annualIncome, employees);
				list.add(legalPerson);
			}else {
				System.out.print("Healthcare expenses:");
				double healthcare = sc.nextDouble();
					NaturalPerson naturalPerson = new NaturalPerson(name, annualIncome,healthcare );
					list.add(naturalPerson);

				
			}

			
		}//fim for
		System.out.println("Taxes Paid:");
		for(Person p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()) );
			
		}
		
		System.out.println();
		double sum = 0.0;
		for(Person p : list) {
			sum += p.tax();
		}
		
		System.out.println("Total taxes: $ " + String.format("%.2f", sum));
	}

}
