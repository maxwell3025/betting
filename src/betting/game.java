package betting;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
	int points = 128;
	int bet = 0;
	double odds = 0.5;
	Scanner s = new Scanner(System.in);
		while(bet!=-1) {
			System.out.println("Bet?");
			bet = Integer.parseInt(s.nextLine());
			if(Math.random()<odds){
				points+=bet;
			}else{
				points-=bet;
			}
			System.out.println("Points: "+points);
		}
		s.close();
	}

}
