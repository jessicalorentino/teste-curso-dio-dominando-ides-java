package com.dio;

import com.dio.model.gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		gato gato=new gato();
		livros livros = new livros();
		
		System.out.println(gato);
		System.out.println(livros);}
		/*int a = 1;
		int b = 2;
		System.out.println("hello world! " + (a+b));
	}*/
}
	class livros{
		private String nome;
		private String npag;
	}
