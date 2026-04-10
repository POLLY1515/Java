package Exercicio5;

public class Aluno {
	
	/*Crie uma classe Aluno com nome, idade e método apresentar() que imprime “Sou
[nome] e tenho [idade] anos”.*/
	
	
	 String aluno;
	int idade;
	
	public Aluno(String aluno, int idade) {
		this.aluno = aluno;
		this.idade = idade;
	}
	
	public void apresentar() {
		System.out.println("Sou " + aluno + " , e tenho " + idade + " anos!");
	}

}
