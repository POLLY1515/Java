package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Exercicio1 {

	public static void main(String[] args) {

		
		//Coleçoes
		
		//Essa linha cria uma lista chamada livros.
	List<String> livros = new ArrayList<>();
	livros.add("Clean code");
	livros.add("Spring in action");
	
	
	System.out.println(livros);
	
	/*1. Set<String> categorias

Aqui você está declarando uma variável chamada categorias.

Set é uma coleção do Java
<String> significa que ela vai guardar textos
diferente de List, o Set não permite elementos repetidos

Ou seja: categorias será um conjunto de palavras sem duplicidade.

2. new HashSet<>()

Aqui você cria o objeto de fato.

HashSet é uma implementação de Set
ele armazena elementos sem repetir
ele não garante ordem*/
	
	Set<String> categorias = new HashSet<>();
	categorias.add("Backend");
	categorias.add("API");
	categorias.add("API");

	
	System.out.println(categorias);
	
	/*O que é Map:

Map é uma coleção que guarda dados em formato de:

chave -> valor

Pense assim:

chave = nome do item
valor = quantidade desse item

No seu exemplo:

"Clean code" é a chave
31 é o valor
Linha 1
Map<String, Integer> estoque = new HashMap<>();
Parte por parte:
Map<String, Integer>

Define o tipo da variável.

Map = estrutura de chave e valor
String = tipo da chave
Integer = tipo do valor

Então isso quer dizer:

esse mapa vai guardar uma chave em texto e um valor numérico inteiro

estoque

É o nome da variável.

new HashMap<>()

Cria o mapa na memória.

HashMap é uma implementação de Map.

O que essa linha significa na prática

Ela quer dizer:

“Crie um mapa chamado estoque, onde a chave será o nome do livro e o valor será a quantidade em estoque.”

Linha 2
estoque.put("Clean code", 31);

O método put serve para inserir um par de dados no mapa.

Aqui você está dizendo:

chave: "Clean code"
valor: 31

Ou seja:

o livro Clean code tem 31 unidades no estoque

Linha 3
estoque.put("Spring actions", 5);

Aqui você adiciona outro item ao mapa:

chave: "Spring actions"
valor: 5

Ou seja:

o livro Spring actions tem 5 unidades no estoque

Como fica o mapa depois disso

Internamente, ele fica parecido com isso:

{
   "Clean code" = 31,
   "Spring actions" = 5
}*/
	Map<String, Integer> estoque = new HashMap<>();
	estoque.put("Clean code", 31);
	estoque.put("Spring actions", 5);
	
	System.out.println(estoque);
	
	}

	
}
