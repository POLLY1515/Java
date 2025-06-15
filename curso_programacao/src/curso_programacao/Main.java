package curso_programacao;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;// numero inteiro
		double x = 12.3456; // numero flutuante
		 String nome = "Maria";
		 int idade = 33;
		 double renda = 4000.0;
		 String product1 = "Computer";
		 String product2 = "officeDesck";
		 int age = 30;
		 int code = 5290;
		 char gender = 'F';
		 double price1= 2100.0;
		 double price2 = 650.50;
		 double measure = 53.234567;
		
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);// O printf serve para imprimir algo formatado,
		//o numero delimita a quantidade de casas decimais que queremos, o %n representa
		// a quebra de linha, e a varialvel(x) representa o numero que se quer formatar
		
		System.out.printf("%.4f%n",x);// Imprimindo com 4 casas decimais
		// Concatenando resultados
		
		System.out.println("Resultado = " + x +" Metros");
		
		System.out.printf(nome + " tem " + idade + " anos, e ganha R$:%.2f reias %n", renda  );
		System.out.println("=================================================");
		System.out.println("Products:");
		System.out.printf( product1 + ", which price is $ %.2f%n " , price1);
		System.out.printf(product2 + ", which price is $ %.2f%n " , price2);
		System.out.println("Recorde: "+ age + " years old, code "+ code + " and: "+ gender );
		
		
		
		System.out.println("Ola mundo!");


	}

}
