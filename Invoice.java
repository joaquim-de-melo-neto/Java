import javax.swing.JOptionPane;

public class InvoiceTest{
	public static void main(String[] args){
		Invoice fatura01 = new Invoice("01","Cd Calcinha Preta 				Vol.4", 2, 11.99);
		
		String message = String.format("O preço da fatura é: %.2f",fatura01.getInvoiceAmmount());
		JOptionPane.showMessageDialog(null,message);
					


	}
}

public class Invoice{
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	//CONSTRUTOR
	public Invoice(String numero, String descricao, int quantidade, double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	} //FIM CONSTRUTOR


	//MÉTODOS DE ACESSO
	public String getNumero(){
		return numero;
	}
	
	public String getDescricao(){
		return descricao;
	}

	public int getQuantidade(){
		return quantidade;
	}	

	public double getPreco(){
		return preco;
	}//FIM MÉTODOS DE ACESSO

	//MÉTODOS MUTATORES
	public void setNumero(String numero){
		this.numero = numero;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}//FIM MÉTODOS MUTATORES

	public double getInvoiceAmmount(){
		double fatura = 0;
		if(quantidade>=0 && preco>=0)
			fatura = quantidade * preco;
		
		return fatura;
	}
}
