import tetris.vdm.*;
import java.util.Scanner;

public class Main{

	private static boolean 	moveDown 	= true;
	private static String  	input 		= ""; 
	private static Scanner 	scanner 	= new Scanner(System.in);
	private static boolean  gameState 	= false; 

	
    public static void main(String[] args) {
    	
	    System.out.println("\n\u001B[37m\u001B[1m Welcome to Tetris\u001B[0m\n");
		System.out.println("\u001B[37m\u001B[1m > a: Play game\u001B[0m");
		System.out.println("\u001B[37m\u001B[1m > b: Run VDM tests\u001B[0m");
		input = scanner.nextLine();
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		if (input.equals("a")){
	    	Game game = new Game();
			game.newRandomTetramino();
			System.out.println(game.printBoard(false, true, false));

			
		  	while (!gameState)  {
			    try {
			    	gameState = game.getGameOver();
			    	moveDown  = game.down();
			    	game.checkLines();
			    	
					System.out.println(game.printBoard(false, false, false));
					//Thread.sleep(1000);
					System.out.println("\u001B[37m\u001B[1m Level "+ game.getLevel() + "\u001B[0m");
					System.out.println("\u001B[37m\u001B[1m Score "+ game.getScore() + "\u001B[0m" + "\n");

					System.out.println("\u001B[37m\u001B[1m"
									+ " Use the keys a(left), d(right), s(rotate), f(drop) q(exit) to move the pieces: "
									+ "\u001B[0m");
					input = scanner.nextLine();
					
					if 		(input.equals("a"))
								game.left();
					else if	(input.equals("d"))
								game.right();
					else if	(input.equals("s"))
								game.rotate();
					else if	(input.equals("f"))
								game.drop();
					else if	(input.equals("q"))
								gameState = true;
					else
						if(!moveDown)
							game.newRandomTetramino();
						else
							moveDown = game.down();
					
					System.out.print("\033[H\033[2J");
					System.out.flush();
				
			    }
				catch(Exception e){e.printStackTrace();}
			}
		  	
		    System.out.println("\u001B[37m\u001B[1m Game Over!\u001B[0m");
			System.out.println("\u001B[37m\u001B[1m Level "+ game.getLevel() + "\u001B[0m");
			System.out.println("\u001B[37m\u001B[1m Score "+ game.getScore() + "\u001B[0m" + "\n");
			System.out.println("\u001B[37m\u001B[1m Press any key to close the game\u001B[0m");
			input = scanner.nextLine();
		}

    	else
    		TestTetris.main();
 
    }
	/*
	public static void myMethod() {
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			int counter = 0;

			  @Override
			  public void run() {
				  
				  if(counter == 2){
					  timer.cancel();
				  }
				  System.out.print(counter);
				  counter++;
			  }
			}, 500,1000);
	}*/
}