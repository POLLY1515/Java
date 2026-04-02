package Exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*O jeito mais seguro de pensar é este:
1. O que entra no sistema?
2. O que precisa ser verificado?
3. Qual regra decide o resultado?
4. O que deve sair no final?
Exemplo simples:
Problema: verificar se um aluno foi aprovado.*/
		
				
		//a nota do aluno 
		//verificar se an noyta do aluno é igual,menor ou maior que 7
		//Regra: pra ser aprovado a nota deve ser igual ou maior que 7
		//saida, aprovado ou reprovado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a nota do aluno");
		int nota = sc.nextInt();
		String resultado;
		if(nota < 7) {
			resultado = "Reprovado";
		}else {
			resultado = "Aprovado";
		}
		
		System.out.println("O aluno(a) esta: " + resultado );

		
		
	}

}
