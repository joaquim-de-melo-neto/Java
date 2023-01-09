import javax.swing.JOptionPane;

public class Account{
	private String name; 
  	private double balance;
	
	// Construtor da classe
	public Account(String name, double balance){
		this.name = name;
		if(balance >= 0) this.balance = balance;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	// Método que deposita dinheiro na conta
	public void deposit(double depositAmmount){
		if(balance >= 0) balance += depositAmmount;
	}
	
	// Método para realização de saque
	public void withdraw(double withdrawAmmount){
		if(withdrawAmmount >=0 && withdrawAmmount <= balance)balance-=withdrawAmmount;
		else System.out.println("Saque excedeu o montante");
	}
}	

public class AccountTest{

	// Método main
	public static void main(String[] args){
	
	// Criar um objeto
	Account account01 = new Account("Joaquim",150);
	
	double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito:"));
	
	account01.deposit(deposito);

	String message = String.format("Saldo da conta é: %f",account01.getBalance());
	
	JOptionPane.showMessageDialog(null,message);
	
	double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:"));
	
	account01.withdraw(saque);

	message = String.format("Saldo da conta é: %f",account01.getBalance());
	
	JOptionPane.showMessageDialog(null,message);
	}

}
