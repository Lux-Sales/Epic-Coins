package applications;

import java.util.Scanner;

import missions.Desafios;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ola");
		System.out.println("Quantos personagens estao aptos para ir Fornalha Infernal?");
		int personagens = sc.nextInt();
		Desafios fornalha = new Desafios(personagens);
		System.out.println("Quantos personagens estao aptos para ir Altar da Ruína?");
		personagens = sc.nextInt();
		Desafios altar = new Desafios(personagens);
		System.out.println("Quantos personagens estao aptos para ir Torre das Ilusões?");
		personagens = sc.nextInt();
		Desafios torre = new Desafios(personagens);

		System.out.println("Você já realizou algum desafio épico hoje?Responda 'y' para sim e 'n' para não.");
		char bol = sc.next().charAt(0);
		if (bol == 'n') {
			fornalha.addMoeda(4*fornalha.getPersonagens());
			altar.addMoeda(4*altar.getPersonagens());

			for (int i = 0; i < torre.getPersonagens()*4; i++) {
					System.out.println("Quais andares pretende ir?");
					int andar = sc.nextInt();
					if (andar <= 10) {
						torre.addMoeda(1);
					}
					else if (andar > 10 && andar <= 20) {
						torre.addMoeda(2);
					} else {
						torre.addMoeda(3);
					}
				}
			}
			
		
		else {
			System.out.println("Quantidade de vezes jogadas Fornalha Infernal:");
			int qtd = sc.nextInt();
			fornalha.addMoeda((4)*(fornalha.getPersonagens())- qtd);
			System.out.println("Quantidade de vezes jogadas Altar da Ruína:");
			qtd = sc.nextInt();
			altar.addMoeda((4)*(altar.getPersonagens()) - qtd);
			System.out.println("Quantidade de vezes jogada Torre das Ilusões:");
			qtd = sc.nextInt();
			System.out.println("Quais andares ainda pretende ir?");
			for (int i = 0; i < (torre.getPersonagens()*4) - qtd; i++) {
				int andar = sc.nextInt();
				if (andar <= 10) {
					torre.addMoeda(1);
				}
				else if (andar > 10 && andar <= 20) {
					torre.addMoeda(2);
				} else {
					torre.addMoeda(3);
				}
	
			}
			
		System.out.println(fornalha.getMoedas() + altar.getMoedas() + torre.getMoedas());
		sc.close();
		}
	}
}

