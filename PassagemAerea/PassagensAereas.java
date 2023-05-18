package exc;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PassagensAereas {
	private static boolean[] assentos = new boolean[10];
	
	static void imprimirCartao(int numeroPoltrona) {
		String message = String.format("Poltrona %d reservada com sucesso.",numeroPoltrona+1);
		JOptionPane.showMessageDialog(null,message);
	}
	
	static void reservarAssento(int opcao) {
		switch(opcao) {
		case 1: 
			int i;
			for(i = 0; i<5;++i) {
				if(assentos[i] == false) {
					assentos[i] = true;
					
					imprimirCartao(i);
					break;
				}
				else if(i==5) {
					int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeira classe cheia. Deseja tentar classe economica?"));
					if(opcao2 == 2) {
						reservarAssento(opcao2);
					}
					
				}
			}
			break;
		case 2:
			int j;
			for( j=5; j<10;++j) {
				if(assentos[j] == false) {
					assentos[j] = true;
					
					imprimirCartao(j);
					break;
				}	
				if(j==10) {
					int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segunda classe cheia. Deseja tentar classe economica?"));
					if(opcao2 == 1) {
						reservarAssento(opcao2);
					}
					
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int opcao=0;
		
		while(true) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica"));
			reservarAssento(opcao);
		}
	}

}