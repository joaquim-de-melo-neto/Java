package exc;

import java.util.ArrayList;
import java.util.List;

public class Vendas {

	public static void main(String[] args) {
		List<Vendedor> vendedores = new ArrayList<>();
		vendedores.add(new Vendedor(1, 5000.634977927676235986347));
		
		System.out.println(vendedores.get(0).getSalarioFinal());

	}

}
