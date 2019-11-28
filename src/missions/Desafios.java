package missions;

public class Desafios {

	private String name;
	private int moedas;
	private Integer personagens;

	public Desafios(String name, int moedas, int personagens) {
		this.name = name;
		this.moedas = moedas;
		this.personagens = personagens;
	}

	public Desafios() {
	}

	public Desafios(int personagens) {
		this.personagens = personagens;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoedas() {
		return moedas;
	}

	public int getPersonagens() {
		return personagens;
	}

	public void setPersonagens(int personagens) {
		this.personagens = personagens;
	}
	
	public int addMoeda(int moedas) {
		return this.moedas += moedas;
	}
	public int removeMoeda(int moedas) {
		return this.moedas -= moedas;
	}
}
