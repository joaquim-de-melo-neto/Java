package capituloseis;

public class Sessao {
	Estacionamento estacionamento;
	Cliente cliente;
	double entrada;
	double saida;
	double preco;
	
	public Sessao(Estacionamento e, Cliente c, double entrada) {
		estacionamento = e;
		cliente = c;
		this.entrada = entrada;
	}
	
	public void calcularTarifa(int entrada, int saida) {
		double tarifa=0;
		if(saida-entrada>3) {
		double horasEstacionadas = Math.ceil(saida - entrada - 3);
		tarifa = horasEstacionadas*0.5 + estacionamento.getTarifaMinima();
		}
		
		if(tarifa>10) tarifa = 10;
		
		else setPreco(tarifa);
	}
	
public void exibirTarifa() {
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Preco: " + preco);
	}
	
	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
