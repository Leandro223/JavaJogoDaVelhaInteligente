package velhainteligente;

public class Tabuleiro {
	
	// Vetor de conversão para impressão na tela
	
	static char [] conversao = {'0', ' ', 'x'};
	
	
	//matrix do tabuleiro
	
	static int [][] tabuleiro;
	
	
	//tamanho do tabuleiro
	int tam;
	
	//divisor de linhas na tela
	String divisor;
	
	
	//metodo construtor recebe como parametro o tamanho do tabuleiro
	
	public Tabuleiro (int tam) {
		this.tam = tam;
		tabuleiro = new int [tam] [tam];
		divisor = gerarDivisor ();
	}
	
	// metodo invocado para a jogado do Jogador
	
	public void fazerJogada ( int l, int c) {
		
		
		if ( tabuleiro [l][c] ==0)
			tabuleiro [l] [c] = -1;
		else
			System.out.println("posicao ja ocupada, perdeu a vez");
		
	}
	
//metodo para a impressao na tela do tabuleiro 
	
	public void imprimir () {
		
		
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.printf(" %c %c", conversao [tabuleiro [i][j] + 1], j == (tam-1) ? ' ' : '|' );
				
			}
			if ( i != (tam-1))
				System.out.println(divisor);
		}
		System.out.println("\r\n");
		
		
	}
	
	//metodo para gerar divisor de linhas. Serve para auxilio da visualizao grafica do tabuleiro
	
	public String gerarDivisor() {
		
		String d = new String ("\r\n");
		
		for (int i = 0; i < (tam -1); i++) {
			
			d += "---+";
		}
		
		d += "---";
		
		return d;
	}
	


}
