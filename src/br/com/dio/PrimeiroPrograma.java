package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		livro livro = new livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}
}

class livro {
	private String nome;
	private String npag;	
}