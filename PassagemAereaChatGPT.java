package exc;

import java.util.Scanner;

public class PassagemAereaChatGPT {
    private static  boolean[] assentos = new boolean[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	PassagemAereaChatGPT p = new PassagemAereaChatGPT();
        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
                p.reservarAssento(true);
            } else if (escolha == 2) {
                p.reservarAssento(false);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void reservarAssento(boolean primeiraClasse) {
        int primeiraPoltrona = primeiraClasse ? 1 : 6;
        int ultimaPoltrona = primeiraClasse ? 5 : 10;
        
        for (int i = primeiraPoltrona - 1; i < ultimaPoltrona; i++) {
            if (assentos[i] == false) {
                assentos[i] = true;
                System.out.println("Your seat number is " + (i + 1) + ". You are in " + (primeiraClasse ? "First Class" : "Economy") + ".");
                return;
            }
        }
        System.out.println((primeiraClasse ? "First Class" : "Economy") + " is full. Would you like to switch to " + (!primeiraClasse ? "First Class" : "Economy") + "? (Type Y or N)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("Y")) {
            reservarAssento(!primeiraClasse);
        } else {
            System.out.println("Next flight leaves in 3 hours.");
        }
    }
}