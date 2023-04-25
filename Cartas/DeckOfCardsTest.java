package poker;

public class DeckOfCardsTest
{
	
	// executa o aplicativo
	public static void main(String[] args)
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória
		Card[] hand = new Card[5];
		// imprime todas as 52 cartas na ordem em que elas são distribuídas
		for (int i = 0; i < 5; i++)
		{
			
			hand[i] = myDeckOfCards.dealCard();
			
			// distribui e exibe uma Card
//			System.out.printf("%-19s", myDeckOfCards.dealCard());

//			if (i % 4 == 0) // gera uma nova linha após cada quarta carta
//				System.out.println();
		}
		System.out.println();
		Player player = new Player(hand);
		player.display();
		System.out.println();

		System.out.println(player.checkRoyalFlush());
		System.out.println(player.checkStraigthFlush());
		System.out.println(player.checkFourOfKind());
		System.out.println(player.checkFullHouse());
		System.out.println(player.checkFlush());
		System.out.println(player.checkStraigth());
		System.out.println(player.checkThreeOfAKind());
		System.out.println(player.checkTwoPair());
		System.out.println(player.checkPair());
	}
} // fim da classe DeckOfCardsTest
