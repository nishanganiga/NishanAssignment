import java.util.*;

class Guesser
{
	
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum = scan.nextInt();
		
		return guessNum;
	}
}

class Player

{	
	int guessNum;
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly Guess the number :");
		System.out.println("-----------------------------------------------------");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire

{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void Compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All the player have won the game");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 have won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 won the game");
			}
			else
			{
			System.out.println("player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 and 3 have won the game");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("player 3 won the game");
		}
		else
		{
			System.out.println("Game over !!!  Try Again...");
		}
	}
}


public class GuesserP 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player 1 Enter Your Name:");
		String p1name=scan.next();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Player 2 Enter Your Name:");
		String p2name=scan.next();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Player 3 Enter Your Name:");
		String p3name=scan.next();
		System.out.println("-----------------------------------------------------");
		
		
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.Compare();

	}

}
