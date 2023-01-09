// Programa para somar dois numeros inseriods pelo usuário 

import java.util.Scanner;

public class Adittion{ // Início da classe
	public static void main(String[] args){ // Início do metódo main
		Scanner input = new Scanner(System.in);
		
		int n1; int n2; int sum;
		
		System.out.printf("Informe o primeiro inteiro: ");
		n1 = input.nextInt();
			
		System.out.printf("Informe o segundo inteiro: %n");
		n2 = input.nextInt();

		sum = n1 + n2;

		System.out.printf("A soma dos numeros e: %d",sum);
	} // Fim do método main
} // Fim da classe Addition



