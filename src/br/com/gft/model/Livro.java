package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro(String nome ,double preco, int qtd,String autor,String tema, int qtdPag) {		
		super(nome,preco,qtd);
		this.autor=autor;
		this.tema=tema;
		this.qtdPag=qtdPag;
	}
	
	
	//get and set
	public String getautor() {
		return autor;
	}
	public void setautor(String autor) {
		this.autor = autor;
	}
	public String gettema() {
		return tema;
	}
	public void settema(String tema) {
		this.tema = tema;
	}
	public int getqtdPag() {
		return qtdPag;
	}
	public void setqtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}


	
	
	@Override
	public Double calculaImposto() {
		double I=0;
		if(tema=="educativo") {
			System.out.println("Livro educativo nao tem imposto: "+getnome());
			return I;
		}else
		{
			I=preco * 0.10; 
			System.out.println("R$"+I+" De impostos sobre o livro "+ getnome());	
			return I;
		}
		
	}		
}
