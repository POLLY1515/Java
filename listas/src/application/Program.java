package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		//Declarando uma lista de numeros inteiros
		//Lista nao aceita tipos primitivos
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Bob");
		list.add("Ana");
		list.add("Alex");
		list.add("Matheus");
		list.add("Juliana");
		
		System.out.println("Itens da lista: ");
		for(String names : list) {
			System.out.println(names);
		}
		/*
		System.out.println("======Adicionamdo Marcos na lista=======");
		list.add(2, "Marcos"); //adicionando item na lista
		System.out.println("Itens da lista: ");
		for(String names : list) {
			System.out.println(names);
		}*/
		System.out.println("===================================================");
		System.out.println("Index of bob: " + list.indexOf("Marcos"));
		System.out.println("===================================================");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("===================================================");
		System.out.println("|Removendo nomes que começam com M");
		list.removeIf(x -> x.charAt(0) == 'M');// removendo item por predicado
		System.out.println("Itens da lista: ");
		for(String names : list) {
			System.out.println(names);
		}
		System.out.println("===================================================");
		System.out.println("Filtrando a lista e deixando apenas nomes que iniciam com A");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String names : result) {
			System.out.println(names);
		}
		System.out.println("===================================================");
		System.out.println("=====Exibindo primeiro elemento que comeca com A ====");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("==================================================="); 
		System.out.println("=====Removendo um item na lista pelo nome ===============");
		list.remove("Ana"); 
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("===================================================");
		System.out.println("=========Removendo item por posicao=============");

		list.remove(1);
		for(String names : list) {
			System.out.println(names);
		}
		
	}
	

}
