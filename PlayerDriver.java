import java.util.Scanner;

public class PlayerDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Player1's name: ");
		String name1 = input.nextLine();
		System.out.println("Available location combination: 'A-E' and '1-5' ");
		System.out.println(name1 + ", enter your your locations in separate lines here: ");
		String[] loc1 = new String[5];
		for (int i = 0; i<loc1.length; i++) {
			loc1[i] = input.nextLine();
		}
		Player player1 = new Player(name1, 0, loc1);
		System.out.println();
		
		System.out.println("Enter Player2's name: ");
		String name2 = input.nextLine();
		System.out.println("Available location combination: 'A-E' and '1-5' ");
		System.out.println(name2 + ", enter your your locations in separate lines here: ");
		String[] loc2 = new String[5];
		for (int i = 0; i<loc2.length; i++) {
			loc2[i] = input.nextLine();
		}
		Player player2 = new Player(name2, 0, loc2);
		System.out.println();
		
		System.out.println("Do not guess same location more than once. Please Be Honest.");
		System.out.println("Proceed ONLY IF you agree.");
		
		do {
			System.out.println(name1 + ", guess " + name2 + "'s location: ");
			String guess1 = input.nextLine();
			player1.Play(loc2, guess1);
			
			System.out.println(name2 + ", guess " + name1 + "'s location: ");
			String guess2 = input.nextLine();
			player2.Play(loc1, guess2);
		} while (!(player1.score == 5 || player2.score == 5));
		System.out.println();
		
		if (player1.score>4) {
			if (player2.score<5) {
				System.out.println(player1.name + " has destroyed all of " + player2.name + "'s ships.");
				System.out.println(player1.name + " is the WINNER.");
			}
			else {
				System.out.println("Both of you HIT all ships in equal trials. Cannot determine a Winner.");
			}
		}
		else {
			System.out.println(player2.name + " has destroyed all of " + player1.name + "'s ships.");
			System.out.println(player2.name + " is the WINNER.");
		}
	}

}
