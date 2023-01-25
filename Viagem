/*Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Viagem{
    
  // Método de cálculo do consumo 
  public static void calcularConsumo(int km, int litros){
    float consumo = km / litros;
    String message = String.format("Consumo médio da viagem: %.2f\n", consumo);
    System.out.println(message);
  }
  
  public static void main(String[] args){
    int kmTotal = 0;
    int litrosTotal =0;
    int sentinela = 1;
    int km = 0;
    int litros = 0;
    Scanner input = new Scanner(System.in);
    
    while(sentinela != 0){
      System.out.println("Informe a quilometragem da viagem.");
      km = input.nextInt();
      System.out.println("Informe o consumo da viagem.");
      litros = input.nextInt();
      calcularConsumo(km,litros);
      kmTotal += km;
      litrosTotal += litros;
      System.out.println("Aperte 0 caso queira parar.");
      sentinela = input.nextInt();
    }
    
    String message = String.format("A quilometragem total da viagem foi de: %d\nO consumo total de combustível foi de: %d", kmTotal, litrosTotal);
    JOptionPane.showMessageDialog(null,message);
    
  }
}
