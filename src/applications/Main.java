package applications;

import java.util.Scanner;

import missions.Desafios;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ola");
		System.out.println("quantos personagens estao aptos para ir fornalha?");
		int personagens = sc.nextInt();
		Desafios fornalha = new Desafios(personagens);
		System.out.println("quantos personagens estao aptos para ir altar?");
		personagens = sc.nextInt();
		Desafios altar = new Desafios(personagens);
		System.out.println("quantos personagens estao aptos para ir torre?");
		personagens = sc.nextInt();
		Desafios torre = new Desafios(personagens);

		System.out.println("vc ja fez algum desafio hoje?Responda 'y' para sim e 'n' para nao");
		char bol = sc.next().charAt(0);
		if (bol == 'n') {
			fornalha.addMoeda(4*fornalha.getPersonagens());
			altar.addMoeda(4*altar.getPersonagens());

			for (int i = 0; i < torre.getPersonagens()*4; i++) {
					System.out.println("quais andares pretende ir?");
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
			System.out.println("quantidade de vezes jogadas fornalha:");
			int qtd = sc.nextInt();
			fornalha.addMoeda((4)*(fornalha.getPersonagens())- qtd);
			System.out.println("quantidade de vezes jogadas altar:");
			qtd = sc.nextInt();
			altar.addMoeda((4)*(altar.getPersonagens()) - qtd);
			System.out.println("quantidade de vezes jogada torre:");
			qtd = sc.nextInt();
			System.out.println("quais andares ainda pretende ir");
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

