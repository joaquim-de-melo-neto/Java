package exercicios_cap14;

public class PhoneToken {
	
	public static void tokenization(String celNumber) {
		
		String[] tokens = celNumber.split("\\D", 4);
		System.out.println("Código Postal: " + tokens[1]);
		System.out.println("Número de telefone: " + tokens[2].concat(tokens[3]));
		
	}
}
