package applications;

import java.util.Scanner;

import missions.Challenges;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("How many characters is fit to go ''Fornalha Infernal''?");
		int characters = sc.nextInt();
		Challenges fornalha = new Challenges(characters);
		System.out.println("How many characters is fit to go ''Altar da Ruina''?");
		characters = sc.nextInt();
		Challenges altar = new Challenges(characters);
		System.out.println("How many characters is fit to go ''Torre das Ilusoes''?");
		characters = sc.nextInt();
		Challenges torre = new Challenges(characters);
		System.out.println("Did you realize any challenge today(y/n)?");
		char bol = sc.next().charAt(0);
		if(bol=='n') {
			fornalha.addCoins(4*fornalha.getCharacters());
			altar.addCoins(4*altar.getCharacters());
			int times = torre.getCharacters()*4;

			System.out.println("You have " + times + " times to go ''Torre das ilusoes''");
			System.out.println("Please, input how many times you want to go between the 1 to 10 floor:");
			int played = sc.nextInt();
			times = times-played;
			torre.addCoins(played);
			System.out.println("You have " + times + " times to go ''Torre das ilusoes''");
			System.out.println("Please, input how many times you want to go between the 11 to 20 floor:");
			played = sc.nextInt();
			times = times-played;
			torre.addCoins(played*2);
			System.out.println("So, you be able to go " + times + " times between 21 to 30 floor");
			torre.addCoins(times*3);
		}
			else
			{
			System.out.println("How many times did you played ''Fornalha Infernal''?");
			int times = sc.nextInt();
			fornalha.addCoins((4)*(fornalha.getCharacters())- times);
			System.out.println("How many times did you played ''Altar da Ruina''?");
			times = sc.nextInt();
			altar.addCoins((4)*(altar.getCharacters()) - times);
			System.out.println("How many times did you played ''Torre das Ilusoes''? ");
			int played = sc.nextInt();
			times = torre.getCharacters()*4 - played;
			System.out.println("You have " + times + " times to go ''Torre das ilusoes''");
			System.out.println("Please, input how many times you want to go between the 1 to 10 floor:");
			times = times-played;
			torre.addCoins(played);
			System.out.println("You have " + times + " times to go ''Torre das ilusoes''");
			System.out.println("Please, input how many times you want to go between the 11 to 20 floor:");
			played = sc.nextInt();
			times = times-played;
			torre.addCoins(played*2);
			System.out.println("So, you be able to go " + times + " times between 21 to 30 floor");
			torre.addCoins(times*3);
			
			
			
	}
		System.out.println("This is how many epic coins you can farm: " + (fornalha.getCoins() + altar.getCoins() + torre.getCoins()));
		sc.close();
}}

