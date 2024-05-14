package MainApp;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int winCount=0;
	System.out.println("****Welcome to Number Game****\n1.You have to guess the number (1-100) randomly generated by machine.\n2.You will be Given 10 chances in each round.\n3.Number of rounds Will be your choice.");
	
	System.out.println("\nEnter number of rounds you want: ");
	int rounds=sc.nextInt();
	
	for(int i=1;i<=rounds;i++) {
		System.out.println("\n\n***Round "+i+" begins****");
		int randomNum = Generaterandom(1,100);
		for(int j=1;j<10;j++) {
			System.out.println("Enter your guess "+j+": ");
			int guess=sc.nextInt();
			if(guess<randomNum ) {
				System.out.println(guess+" is low.");
			}
			else if(guess>randomNum) {
				System.out.println(guess+" is high.");
			}
			else if(guess==randomNum) {
				System.out.println("You won...");
				winCount++;
				break;
				
			}
		}
		System.out.println("Game Over");
		System.out.println("Total Winnings "+winCount+" in rounds "+rounds);
		
	}
}
 public static int Generaterandom(int min,int max) {
	 return (int) (Math.random()*(max-min+1)+min);

   }
 }
