package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja   {
	private String nome;
	private String cnpj;	
	private List<Livro>livros;
	private List<VideoGame>videoGames;
	
	public Loja(String nome,String cnpj, List<Livro> livro,List<VideoGame> videoGames) {
		this.cnpj=cnpj;
		this.nome=nome;
		this.livros=livro;
		this.videoGames=videoGames;
	}

	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getcnpj() {
		return cnpj;
	}
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void listalivros() {
		if(livros!=null) {
		System.out.printf("A loja Americanas possui estes livros para venda: \n");
		for(int i=0;i<livros.size();i++){ 
			System.out.println("Titulo: "+livros.get(i).getnome()+", preço: "+livros.get(i).getpreco()+", Quantidade: "+livros.get(i).getqtd()+" em estoque");
			
		}System.out.println("------------------------------------------");
	}
	}
	public void listaVideoGame() {
		if(videoGames != null) {
			System.out.printf("A loja Americanas possui estes videogames para venda: \n");
			for(int i=0;i<videoGames.size();i++){ 
				System.out.println("Video-game: "+videoGames.get(i).getnome()+", preço: "+videoGames.get(i).getpreco()+", Quantidade: "+videoGames.get(i).getqtd()+" em estoque");
			
		}
		
		}else {System.out.println("A loja não tem video-games no seu estoque");}
		System.out.println("------------------------------------------------");
	}
	
	public Double calculaPatrimonio() {
		Double P=0.00;
		for(int i=0;i<videoGames.size();i++){ 
		P=livros.get(i).getpreco() + videoGames.get(i).getpreco()+i;
		}System.out.println("O valor total do pratrimonio é "+ P);
		
		return P;
	}
	
	
	
	
	
}
