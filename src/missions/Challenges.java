package missions;

public class Challenges {

	private String name;
	private int coins;
	private Integer characters;

	public Challenges(String name, int coins, int characters) {
		this.name = name;
		this.coins = coins;
		this.characters = characters;
	}

	public Challenges() {
	}

	public Challenges(int characters) {
		this.characters = characters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoins() {
		return coins;
	}

	public int getCharacters() {
		return characters;
	}

	public void setCharacters(int characters) {
		this.characters = characters;
	}
	
	public int addCoins(int coins) {
		return this.coins += coins;
	}
	public int removeCoins(int coins) {
		return this.coins -= coins;
	}
	
}
