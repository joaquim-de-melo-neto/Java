import javax.swing.JOptionPane;

public class Soma{

public static void main(String[] args){

	int n1, n2, sum;

	n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));

	sum = n1 + n2;

	String message = String.format("A soma é: %d",sum);
	
	JOptionPane.showMessageDialog(null,"A soma é: "+sum); // POSSO TROCAR O SEGUNDO ARGUMENTO POR message.
}
}
