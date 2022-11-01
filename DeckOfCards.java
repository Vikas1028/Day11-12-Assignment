import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Cards = { "Club Of Ace", "Diamond Of Ace", "Heart Of Ace", "Spades Of Ace", "Club Of 2",
				"Diamond Of 2", "Heart Of 2", "Spades Of 2", "Club Of 3", "Diamond Of 3", "Heart Of 3", "Spades Of 3",
				"Club Of 4", "Diamond Of 4", "Heart Of 4", "Spades Of 4", "Club Of 5", "Diamond Of 5", "Heart Of 5",
				"Spades Of 5", "Club Of 6", "Diamond Of 6", "Heart Of 6", "Spades Of 6", "Club Of 7", "Diamond Of 7",
				"Heart Of 7", "Spades Of 7", "Club Of 8", "Diamond Of 8", "Heart Of 8", "Spades Of 8", "Club Of 9",
				"Diamond Of 9", "Heart Of 9", "Spades Of 9", "Club Of 10", "Diamond Of 10", "Heart Of 10",
				"Spades Of 10", "Club Of Jack", "Diamond Of Jack", "Heart Of Jack", "Spades Of Jack", "Club Of Queen",
				"Diamond Of Queen", "Heart Of Queen", "Spades Of Quess", "Club Of King", "Diamond Of King",
				"Heart Of King", "Spades Of King" };
		Random Rand = new Random();
		int count = 0;
		while (count < 36) {
			int print = Rand.nextInt(52);
			String x = "Print";
			if (Cards[print] != x) {
				System.out.print("{" + Cards[print] + "}" + "  ");
				if (count == 8 || count == 17 || count == 26) {
					System.out.println();
				}
				Cards[print] = "Print";
				count++;
			}
		}
	}
}
