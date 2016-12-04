import java.util.Scanner;

public class onevsone {
	
		private static Scanner in;
	
		public static void main(String[] args) {
			
			//player and enemy names, stats
			String PlayerName;
			System.out.println("Please enter your name:");
			in = new Scanner(System.in);
			PlayerName = in.next();
			
			String EnemyName;
			System.out.println("Please enter enemy name:");
			in = new Scanner(System.in);
			EnemyName = in.next();
			
			int EnemyHealth = 30;
			int PlayerHealth = 30;
			
			//attack loop
			String tryAgain = "yes";
			do {
			String AttackOrNot;
			System.out.println("Enter 'attack' to attack " + EnemyName + " , or enter heal to heal 1 health");
			in = new Scanner(System.in);
			AttackOrNot = in.next();
			
			if(AttackOrNot.equals("attack")) {
				System.out.println(PlayerName + " attacked " + EnemyName);
				EnemyHealth = EnemyHealth - 1;
				PlayerHealth = PlayerHealth - 1;
				System.out.println("Both player and enemy attacked");
				System.out.println("Remaining health of " + EnemyName + " : " + EnemyHealth + " , " + PlayerName + "'s health is: " + PlayerHealth);
			}
			
			else if(AttackOrNot.equals("heal")) {
				PlayerHealth = PlayerHealth + 1;
				System.out.println("Enemy did nothing");
				System.out.println(PlayerName + " healed 1 health, current health: " + PlayerHealth);
			}
			
			else {
				System.out.println("Input error");
			}
			
			System.out.println("Continue game? enter 'no' to end the game");
			tryAgain = in.next();
		}
		while(!tryAgain.equals("no"));
			
		System.out.println("Thanks for playing!");
			
	}
		
}
	


