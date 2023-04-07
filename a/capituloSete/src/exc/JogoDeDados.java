package exc;

import java.security.SecureRandom;

public class JogoDeDados {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		int dado1 = 0, dado2 = 0;
		int[][] frequency = new int[6][6];
		
//		iteração para contagem de frequência
		for(int count=1; count<=1000; ++count) {
			dado1 = random.nextInt(1,7);
			dado2 = random.nextInt(1,7);
			
			++frequency[dado1-1][dado2-1];
		} // fim da iteração de contagem de frequência
		
//		iteração para escrever o label superior da tabela
		for(int label=1; label<=6; ++label) {
			if(label==1)
				System.out.printf("%7d ",label);
			else
				System.out.printf("%6d ",label);
		}// fim da iteração do label superior
		
//		iteração para escrever as linhas
		System.out.println();
		for(int linha=1; linha<=6; ++linha) {
			System.out.printf("%d",linha);
			for(int coluna=0; coluna<6;++coluna) {
				System.out.printf("%7d",frequency[linha-1][coluna]);
			}
			System.out.println();
		}// fim da iteração de escrita de linhas
		
//		somando os valores para conferir
		int total=0;
		for(int[] fr:frequency) {
			
			for(int f:fr) {
				 total+=f;
			}
		}
		System.out.println(total);
	}

}
