package exercicios_cap14;

import java.security.SecureRandom;

public class AleatoryPhrase {
	
	private static final String[] article = {" the", " a", " one", " some" , " any"};
	private final static String[] noun = {" boy", " girl", " dog", " town" , " car"};
	private final static String[] verb = {" drove", " jumped", " ran", " walked" ,	" skipped"};
	private final static String[] preposition = {" to", " from", " over", " under", " on"};
	private final static SecureRandom random  = new SecureRandom();

	public static void main(String[] args) {
		String msg = "";
		for(int phrases=1;phrases<=20;++phrases) {
			msg += article[random.nextInt(5)];
			msg += noun[random.nextInt(5)];
			msg += verb[random.nextInt(5)];
			msg += preposition[random.nextInt(5)];
			msg += article[random.nextInt(5)];
			msg += noun[random.nextInt(5)];
			msg += ".";
			msg = msg.trim();
			StringBuilder builder = new StringBuilder(msg);
			builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
			System.out.println(builder);
			msg="";
		}

	}

}
