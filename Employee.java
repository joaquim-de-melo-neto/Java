public class Employee{

	private String name;
	private String lastName;
	private double salary;

	public Employee(String name, String lastName, double salary){

		this.name = name;
		this.lastName = lastName;
		if(salary > 0) this.salary = salary;
	}

	// Métodos Acessores
	public String getName(){
	
		return name;	
	}

	public String getLastName(){
	
		return lastName;	
	}

	public double getSalary(){
	
		return salary;	
	}

	// Métods Mutatores
	public void setName(String name){

		this.name = name;
	}

	public void setLastName(String lastName){

		this.lastName = lastName;
	}

	public void setSalary(double salary){
		
		if(salary > 0) this.salary = salary;
		else System.out.printf("Informe um salário válido para o %s %s.",name,lastName);
	}

	// Métodos 
	public void aumentoSalarial(double percentil){
		
		if(percentil > 0.05 && percentil < 0.2) salary *= (1+percentil);
		else System.out.println("Informe uma porcentagem abaixo de 20%"); 
	}

	public void showEmployee(){

		System.out.println("Nome: " + name);
		System.out.println("Sobrenome: " + lastName);
		System.out.println("Salário: " + salary);
	}

	public static void linha(){

		System.out.printf("\n\n***********************\n\n");
	}
}


import javax.swing.*;

public class EmployeeTest{
	public static void main(String[] args){

		Employee empregado1 = new Employee("Joaquim","Neto",1000);
		Employee empregado2 = new Employee("Gabriel","Santos",-2000);

		empregado1.showEmployee();
		empregado2.showEmployee();

		Employee.linha();

		empregado1.aumentoSalarial(0.1);
		empregado2.setSalary(2000);
		
		empregado1.showEmployee();
		empregado2.showEmployee();

		Employee.linha();

		empregado2.setSalary(-3000);

		JOptionPane.showMessageDialog(null,"Funcionou");			
	}


}
