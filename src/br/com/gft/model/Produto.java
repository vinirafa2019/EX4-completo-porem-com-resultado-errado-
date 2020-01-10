package br.com.gft.model;

public abstract class Produto {
    protected String nome;    
    protected double preco;
    protected int qtd;
	//Metodo Contrutor
    public Produto(String nome,double preco,int qtd) {
		this.nome=nome;
		this.preco=preco;
		this.qtd=qtd;
		}
    
  //get/set
    public String getnome() {
    	return nome;
    }
    public void setnome(String nome) {
    	this.nome = nome;
    }
    public double getpreco() {
    	return preco;
    }
    public void setpreco(double preco) {
    	this.preco = preco;
    }
    public int getqtd() {
    	return qtd;
    }
    public void setqtd(int qtd) {
    	this.qtd = qtd;
    }
    
  
}
