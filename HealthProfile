/* A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33.*/

public class HealthProfile{
  private String nome;
  private String sobrenome;
  private char sexo;
  private int dia;
  private int mes;
  private int ano;
  private double altura;
  private double peso;
  
  // Construtor
  public HealthProfile( String nome, String sobrenome, char sexo ,int dia, int mes, int ano, double altura, double peso){
    this.nome = nome;
    this.sobrenome = sobrenome;
    if(sexo == 'm'|| sexo == 'M'|| sexo == 'f' || sexo == 'F')
      this.sexo = sexo;
    if((mes==2 && dia<=28)||
			(mes<8 && mes!=2 && mes%2==0 && dia<=30)||
			(mes<8 && mes!=2 && mes%2==1 && dia<=31)||
			(mes>=8 && mes%2==0 && dia<=31)||
			(mes>=8 && mes%2==1 && dia<=30)){
          this.dia = dia;
          this.mes = mes;
          this.ano = ano;
    }
    this.altura = altura;
    this.peso = peso;
  }
  
  // Getters
  public String getNome(){
    return nome;
  }
  public String getSobrenome(){
    return sobrenome;
  }
  public char getSexo(){
    return sexo;
  }
  public int getDia(){
    return dia;
  }
  public int getMes(){
    return mes;
  }
  public int getAno(){
    return ano;
  }
  public double getAltura(){
    return altura;
  }
  public double getPeso(){
    return peso;
  }
  
  // Setters
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
  }
  public void setSexo(char sexo){
    this.sexo = sexo;
  }
  public void setDia(int dia){
    this.dia = dia;
  }
  public void setMes(int mes){
    this.mes = mes;
  }
  public void setAno(int ano){
    this.ano = ano;
  }
  public void setAltura(double altura){
    this.altura = altura;
  }
  public void setPeso(double pesp){
    this.peso = peso;
  }
  // Métodos
  // Cálculo do IMC
  public double IMC(){
  	double imc = peso / (altura * altura);
	return imc;
  }

  public int calcularIdade(int diaAtual, int mesAtual, int anoAtual){
    int idade = anoAtual - ano;
    if(mesAtual < mes || (mesAtual == mes && diaAtual < dia)) idade--;
    return idade;
  }
  
  // Cálculo da Frequência Cardíaca Máxima (FCM). 220 - idade.
  public int FCM(int diaAtual, int mesAtual, int anoAtual){
    return 220 - this.calcularIdade(diaAtual, mesAtual, anoAtual);
  }
  
  // Cálculo da Frequência Cardíaca Alvo (FCA). 50% a 85% da FCM.
  public String FCA(int diaAtual, int mesAtual, int anoAtual){
    int fcm = this.FCM(diaAtual, mesAtual, anoAtual);
    double fcmMin = 0.5*fcm;
    double fcmMax = 0.85*fcm;
    
    String strFcmMin = String.valueOf(fcmMin);
    String strFcmMax = String.valueOf(fcmMax);
    
    String message = "O FCA está entre: ".concat(strFcmMin).concat(" e ").concat(strFcmMax);
    return message;
  }
  
}

import javax.swing.*;
public class HealthProfileTeste{

public static void main(String[] args){
	// Entrada de dados
	String nome = JOptionPane.showInputDialog("Informe o nome: ");
	String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome: ");
	String s = JOptionPane.showInputDialog("Informe o sexo: ");
	char sexo = s.charAt(0);
	int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do seu nascimento: ")); 
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês do seu nascimento: "));
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento: "));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
	
	// Criação do objeto
	HealthProfile paciente = new HealthProfile(nome,sobrenome,sexo,dia,mes,ano,altura,peso);
	int idade = paciente.calcularIdade(24,1,2023);
	double imc = paciente.IMC();
	String messageFCA = paciente.FCA(24,1,2023); 
	String string = String.format("Paciente: %s %s\nIdade: %d\nIMC: %f\n%s",nome, sobrenome,idade,imc,messageFCA);
	JOptionPane.showMessageDialog(null,string);


		
	}
}
