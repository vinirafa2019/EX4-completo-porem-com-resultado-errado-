package br.com.gft.model;

public class VideoGame extends Produto {
	private String marca;
	private String modelo;
	private boolean isUsado;

	
	
	
	
	public VideoGame(String nome,double preco,int qtd, String marca,String modelo,boolean isUsado) {
		super(nome,preco,qtd);
		this.marca=marca;
		this.modelo=modelo;
		
		
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	public Double calculaImposto() {
		double I=0;
		if(isUsado==true) {
			I=preco * 0.25; 
			
			System.out.print("Imposto PS4 Slim Usado, R$ "+I);
		}else {
			I=preco * 0.45;
			System.out.print("Imposto PS4 Slim R$ "+I+"\n");
			
		}
		return I;
	}
	
	
}
