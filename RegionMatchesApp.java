package exercicios_cap14;

import java.util.Scanner;

public class RegionMatchesApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.print("Informe a primeira String: ");
		String string1 = input.nextLine();
		
		System.out.print("Informe a segunda String: ");
		String string2 = input.nextLine();
		
		System.out.print("Informe o numero de caracteres que serão comparados: ");
		int len = input.nextInt();
		
		System.out.print("Informe em qual índice começara a comparação: ");
		int index = input.nextInt();
		
		boolean res = string1.regionMatches(true, 0, string2, index, len);
		
		String msg = res ? "match" : "not match";
		
		System.out.printf("%s\n\n",msg);
		input.nextLine();
		}while(true);
	}

}
