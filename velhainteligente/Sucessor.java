package velhainteligente;

//Classe sucessor - Gera os estados do jogo da velha

public class Sucessor {
	
	int [][] tabuleiro;
	int utilidade;
	
	//metodo construtor
	
	public Sucessor (int [][] tab) {
		
		//Criar um novo tabuleiro baseado no que foi passado
		
		int tam = tab.length;
		tabuleiro = new int [tam] [tam];
		
		for (int i =0; i < tam; i++)
			for(int j = 0; j < tam; j++)
				tabuleiro [i][j] = tab [i][j];
		
		
		
	}

}
