package exc;

import java.math.BigDecimal;

public class Vendedor {
	private int id;
	private final BigDecimal  salarioFixo = new BigDecimal(200.0);
	private BigDecimal vendas;
	private final static BigDecimal taxa = new BigDecimal(0.09);
	private BigDecimal salarioFinal;

	public Vendedor(int id, double vendas) {
		this.id = id;
		this.vendas = new BigDecimal(vendas);
		salarioFinal = new BigDecimal(calcularSalario());
	}
	
	public double calcularSalario() {
		return salarioFixo.doubleValue() + vendas.doubleValue()*taxa.doubleValue();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getVendas() {
		return vendas;
	}

	public void setVendas(BigDecimal vendas) {
		this.vendas = vendas;
	}

	public BigDecimal getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(BigDecimal salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

}