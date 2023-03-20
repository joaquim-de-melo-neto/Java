import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Pergunta {

	static void pergunta(int dificuldade) {
		SecureRandom random = new SecureRandom();
		int resposta = 0;
		int a=0,b=0;
		double nota=0;
		double acertos=0;
		double erros=0;
		for(int questoes = 1; questoes<=10; questoes++){
			switch(dificuldade) {
			case 1: a = random.nextInt(10);
					b = random.nextInt(10);
					break;
			case 2:	
			default:a = random.nextInt(99);
					b = random.nextInt(99);
					break;	
			}
			
			int gabarito = a * b;
			while(true){
				String message = String.format("Quanto é %d x %d ?", a, b);
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
		String message = String.format("ACERTOS: %f\nERROS: %f\nNOTA: %f", acertos, erros, nota);
		JOptionPane.showMessageDialog(null,message);
		if(nota>=0.75) JOptionPane.showInternalMessageDialog(null,"Você está pronto para o próximo nível!");
		else 		  JOptionPane.showInternalMessageDialog(null,"Peça ajuda ao professor!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Vamos começar.");
		while(true) {
			
			Pergunta.pergunta(Integer.parseInt(JOptionPane.showInputDialog("Informe o nivel de dificuldade: 1 ou 2?")));
			JOptionPane.showMessageDialog(null,"Próximo aluno.");		
		}
	}

}
