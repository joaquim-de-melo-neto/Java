/*demonstramos a classificação sem distinção de maiúsculas e minúsculas e a classificação em ordem decrescente. Ao
longo desse exemplo, usamos o array String strings (linhas 11 e 12), que é inicializado com os nomes das cores — alguns dos
quais com uma letra maiúscula inicial. A linha 15 exibe o conteúdo de strings antes de realizar qualquer processamento de fluxo.*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysStreams2 {
	public static void main(String[] args) {
		String[] strings = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };

		// exibe strings originais
		System.out.printf("Original strings: %s%n", Arrays.asList(strings));

		// strings em maiúsculas
		System.out.printf("strings in uppercase: %s%n",
				Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

		// strings menores que “n” (sem distinção maiúsc/minúsc) em ordem crescente
		System.out.printf("strings greater than m sorted ascending: %s%n",
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER)
						.collect(Collectors.toList()));

		// strings menores que “n” (com distinção maiúsc/minúsc) em ordem decrescente
		System.out.printf("strings greater than m sorted descending: %s%n",
				Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
						.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
	}
} // fim da classe ArraysAndStreams
