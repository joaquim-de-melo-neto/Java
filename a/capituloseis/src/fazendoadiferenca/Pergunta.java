package fazendoadiferenca;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Pergunta { // INICIO DA CLASSE
	
	// MÉTODO PARA FAZER PERGUNTA
	static void pergunta(int dificuldade, int operacaoAritmetica) {
		SecureRandom random = new SecureRandom();
		int resposta = 0;
		int a=0,b=0;
		double nota=0;
		double acertos=0;
		double erros=0;
		
		// ITERAÇÃO DE DEZ PERGUNTAS. APENAS PASSA PARA A PRÓXIMA ITERAÇÃO COM UMA RESPOSTA CORRETA.
		for(int questoes = 1; questoes<=10; questoes++){
			switch(dificuldade) {
			case 1: a = random.nextInt(10);
					b = random.nextInt(10);
					break;
			case 2:	
			default:a = random.nextInt(10,99);
					b = random.nextInt(10,99);
					break;	
			}
			
			int gabarito = 0;
			char operador = '+';
			switch(operacaoAritmetica) {
			case 1: gabarito = a+b; break;
			case 2: gabarito = a-b; operador = '-'; break;
			case 3: gabarito = a*b; operador = '*'; break;
			case 4: gabarito = a/b; operador = '/'; break;
			default: System.out.println("Informe um operador válido."); return;
			}
			while(true){
				String message = String.format("Quanto é %d %c %d ?", a, operador, b);
				resposta = Integer.parseInt(JOptionPane.showInputDialog(message));
				
				int opcaoMensagem = random.nextInt(4);
				if (resposta == gabarito) {
					acertos++;
					switch(opcaoMensagem) {
					case 1:JOptionPane.showInternalMessageDialog(null, "Muito bem!"); break;
					case 2:JOptionPane.showInternalMessageDialog(null, "Excelente!"); break;
					case 3:JOptionPane.showInternalMessageDialog(null, "Bom trabalho!"); break;
					default: JOptionPane.showInternalMessageDialog(null, "Ótimo. Mantenha um bom trabalho!"); break;
					}
					break;
					
				} else {
					erros++;
					switch(opcaoMensagem) {
					case 1:JOptionPane.showInternalMessageDialog(null, "Não. Por favor, tente novamente!"); break;
					case 2:JOptionPane.showInternalMessageDialog(null, "Tente mais uma vez!"); break;
					case 3:JOptionPane.showInternalMessageDialog(null, "Continue tentando!"); break;
					default: JOptionPane.showInternalMessageDialog(null, "Não desista!"); break;
					}

				}
			}
		}
		nota = (acertos)/(acertos+erros);
		String message = String.format("ACERTOS: %d\nERROS: %d\nNOTA: %.2f", (int)acertos, (int)erros, nota);
		JOptionPane.showMessageDialog(null,message);
		if(nota>=0.75) JOptionPane.showInternalMessageDialog(null,"Você está pronto para o próximo nível!");
		else 		  JOptionPane.showInternalMessageDialog(null,"Peça ajuda ao professor!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Vamos começar.");
		while(true) {
			try {
				Pergunta.pergunta(Integer.parseInt(JOptionPane.showInputDialog("Informe o nivel de dificuldade: 1 ou 2?")),Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de operação aritmética:\n1 +\n2 -\n3 x\n4 /")));
			}
			catch(NumberFormatException e){
				System.out.println("mensagem: " + e);
			}
			JOptionPane.showMessageDialog(null,"Próximo aluno.");		
		}
	}

}
