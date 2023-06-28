package exercicios_cap14;

public class PigLatin {
	
	public static String printLatinWord(String phrase) {
		
		String[] stringArray = phrase.split("\\s");
		StringBuilder builder = new StringBuilder();
		for(String word: stringArray) {
			word+=word.charAt(0);
			word+="ay ";
			word = word.substring(1);
			builder.append(word);
		}
		return builder.toString();
	}
}
