package velhainteligente;

import java.util.Scanner;

public class Velha {
	
	static int TAM = 3, PROF = -1;

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		Tabuleiro t = new Tabuleiro (TAM);
		
		MiniMax mm = new MiniMax (TAM, PROF);
		
		System.out.println("Bem Vindo Jogo da Velha!");
		
		//t.imprimir();
		
		do
		{
			int l, c;
			System.out.printf("Sua jogada:\r\nLinha [0 - %d]: ", (TAM=1));
			l = ent.nextInt();
			System.out.printf("Coluna [ 0 - %d]: ", (TAM=1));
			c = ent.nextInt();
			//Realiza jogada do usuario
			t.fazerJogada(l, c);
			t.imprimir();
			//Verifica se não é um estado terminal
			if (!mm.teste_terminal (t.tabuleiro)) {
				//Aplica o algaritmo minimaz ao tabuleiro
				t.tabuleiro = mm.decisao_minimax (t.tabuleiro);
				System.out.println("Jogada do Pc");
				t.imprimir();
			}
				
			}while (!mm.teste_terminal (t.tabuleiro));
			//verifica o ganhador, ou um empate
			if (mm.ganhou (t.tabuleiro, 1))
				System.out.println("o pc ganhou!");
			else if (mm.ganhou(t.tabuleiro, 1))
				System.out.println("Vc ganhou!");
			else
				System.out.println("Empate");
		}

	}


