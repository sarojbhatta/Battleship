
public class Player {
	public String name;
	public int score;
	public String[] loc = new String[5];
	
	public Player(String name, int score, String[] locs) {
		this.name = name;
		this.score = score;
		
		for (int i = 0; i < locs.length; i++) {
			loc[i] = locs[i];
		}
	}
	
	public void Play(String[] locOpponent, String yourGuess) {
		int checker = 0; //to keep track of HIT/MISS
		for (int i = 0; i < locOpponent.length; i++) {
			if (yourGuess.equalsIgnoreCase(locOpponent[i])) {
				checker++;
			}
		}
		
		if (checker>0) {
			System.out.println("HIT. Congratulations!");
			score++;
		}
		else {
			System.out.println("MISS. Good Luck next time");
		}
		System.out.println();
	}
	
}
