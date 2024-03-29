package poker;

import java.util.Arrays;

public class Player {
	private Card[] hand;

	public Player(Card[] hand) {
		this.hand = hand;
		Arrays.sort(hand, new CardComparator());

	}

//	mostra a mão do jogador
	public void display() {
		for (Card h : hand) {
			System.out.println(h);
		}
	}

//  checa por um par
	public boolean checkPair() {
		for (int outer = 0; outer < hand.length - 1; outer++) {
			String face = hand[outer].getFace();
			for (int inner = outer + 1; inner < hand.length; inner++) {
				String otherFace = hand[inner].getFace();
				if (face.equals(otherFace))
					return true;
			}
		}
		return false;
	}

//  checa por dois pares
	public boolean checkTwoPair() {
//		checa todas as combinações possíveis de dois pares
		if (hand[0].getFace().equals(hand[1].getFace()) && hand[2].getFace().equals(hand[3].getFace())
				|| hand[0].getFace().equals(hand[1].getFace()) && hand[3].getFace().equals(hand[4].getFace())
				|| hand[1].getFace().equals(hand[2].getFace()) && hand[3].getFace().equals(hand[4].getFace()))
			return true;
		return false;
	}

//  checa por uma trinca	
	public boolean checkThreeOfAKind() {
		for (int outer = 0; outer < hand.length - 2; outer++) {
			int count = 0;
			for (int inner = outer + 1; inner < hand.length; inner++) {
				if (hand[outer].getFace().equals(hand[inner].getFace())) {
					count++;
					if (count == 2)
						return true;
				}
			}
		}
		return false;

	}

//	checa por uma sequência
	public boolean checkStraigth() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		int sequenceIndex = 0; // guarda o valor do indexador de face que é igual em hand
		for (int index = 0; index <= 8; index++) {
			if (faces[index].equals(hand[0].getFace()))
				sequenceIndex = index;
		}
//		compara as sequências dos arrays hand e faces
		for (int index = 1; index < hand.length; index++) {
			if (!(hand[index].getFace().equals(faces[sequenceIndex + index])))
				return false;
		}
		return true;
	}

//	checa por 05 cartas do mesmo naipe
	public boolean checkFlush() {
		for (int index = 0; index < hand.length - 1; index++) {
			if (!hand[index].getSuit().equals(hand[index + 1].getSuit()))
				return false;
		}
		return true;
	}

//	checa por um full house. uma trinca e um par ao mesmo tempo
	public boolean checkFullHouse() {
		if (hand[0].getFace().equals(hand[1].getFace()) && hand[2].getFace().equals(hand[3].getFace())
				&& hand[3].getFace().equals(hand[4].getFace())
				|| hand[0].getFace().equals(hand[1].getFace()) && hand[1].getFace().equals(hand[2].getFace())
						&& hand[3].getFace().equals(hand[4].getFace()))
			return true;
		return false;
	}

//	checa por uma quadra
	public boolean checkFourOfKind() {
		for (int outer = 0; outer < 2; outer++) {
			String face = hand[outer].getFace();
			for (int inner = outer + 1; inner < hand.length; inner++) {
				String otherFace = hand[inner].getFace();
				int count = 0;
				if (face.equals(otherFace)) {
					count++;
					if (count == 3)
						return true;
				}
			}
		}
		return false;
	}

//	checa por um straigth flush
	public boolean checkStraigthFlush() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		int sequenceIndex = 0; // guarda o valor do indexador de faces que é igual em hand
		String suit = null; // guarda o naipe da carta que deverá ser preto para ser usado na comparação que
							// segue

		for (int index = 0; index <= 8; index++) {
			if (faces[index].equals(hand[0].getFace()))
				sequenceIndex = index;
			if (hand[0].getSuit().equals("Clubs") || hand[0].getSuit().equals("Spades"))
				;
			suit = hand[0].getSuit();
		}
//		compara as sequências dos arrays hand e faces
		for (int index = 1; index < hand.length; index++) {
			if (!(hand[index].getFace().equals(faces[sequenceIndex + index]) && hand[index].getSuit().equals(suit)))
				return false;
		}
		return true;
	}

//	checa por um royal flush
	public boolean checkRoyalFlush() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		int sequenceIndex = 0; // guarda o valor do indexador de faces que é igual em hand
		String suit = null; // guarda o naipe da carta que deverá ser vermelho para ser usado na comparação
							// que segue

		for (int index = 0; index <= 8; index++) {
			if (faces[index].equals(hand[0].getFace()))
				sequenceIndex = index;
			if (hand[0].getSuit().equals("Hearts") || hand[0].getSuit().equals("Diamonds"))
				;
			suit = hand[0].getSuit();
		}
//		compara as sequências dos arrays hand e faces
		for (int index = 1; index < hand.length; index++) {
			if (!(hand[index].getFace().equals(faces[sequenceIndex + index]) && hand[index].getSuit().equals(suit)))
				return false;
		}
		return true;
	}
}
