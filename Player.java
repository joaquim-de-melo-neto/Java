package poker;

import java.util.Arrays;

public class Player {
	private Card[] hand;

	public Player(Card[] hand) {
		this.hand = hand;
	}

// checa por um par
	public boolean checkPair(Card[] hand) {
		Arrays.sort(hand);
		for (int outer = 0; outer < hand.length - 2; outer++) {
			String face = hand[outer].getFace();
			for (int inner = outer + 1; inner < hand.length; inner++) {
				String otherFace = hand[inner].getFace();
				if (face.equals(otherFace))
					return true;
			}
		}
		return false;

	}

	public boolean checkTwoPair(Card[] hand) {
		return false;
	}

// checa for uma trinca	
	public boolean checkThreeOfAKind(Card[] hand) {
		Arrays.sort(hand);
		for (int outer = 0; outer < hand.length - 3; outer++) {
			String face = hand[outer].getFace();
			for (int inner = outer + 1; inner < hand.length; inner++) {
				String otherFace = hand[inner].getFace();
				int count = 0;
				if (face.equals(otherFace)) {
					count++;
					if (count == 2)
						return true;
				}
			}
		}
		return false;

	}

}
