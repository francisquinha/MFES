import tetris.vdm.*;
import java.util.Random;
import java.util.Scanner;

public class Main{
	
	static boolean keepRunning = true;
	static boolean result = true;
	private static Scanner in;
    
	public static Tetramino randomTetramino (Game game){
		
		Random gerador = new Random();
		 
		int num = gerador.nextInt(6);
		Tetramino tetramino = null;
		
		   switch (num) {
           case 0:  tetramino = new TetraminoI(game.board);
                    break;
           case 1:  tetramino = new TetraminoJ(game.board);
                    break;
           case 2:	tetramino = new TetraminoL(game.board);
                    break;
           case 3:  tetramino = new TetraminoO(game.board);;
                    break;
           case 4:  tetramino = new TetraminoS(game.board);
                    break;
           case 5:  tetramino = new TetraminoT(game.board);
                    break;
           case 6:	tetramino = new TetraminoZ(game.board);
                    break;
           default: tetramino = new TetraminoI(game.board);
           			break;
		   }
		return tetramino;
	}
	
    public static void main(String[] args) {
    	
    	
		System.out.println("Welcome to Tetris");
		System.out.println("> a: Play game");
		System.out.println("> b: Run VDM tests");
		in = new Scanner(System.in);
		
		String x = in.nextLine();
    	
    	if (x.equals("a")){
			Game game = new Game();
			System.out.println(game.board.getBoardPrint(""));
	
			Tetramino tetramino = new TetraminoZ(game.board);
			System.out.println(game.board.getBoardPrint(""));
			 
			tetramino.moveDown(game.board);
			System.out.println(game.board.getBoardPrint(""));
			
	    	while (keepRunning)  {
	            try {        		
	        		//Thread.sleep(1000);
	        		
	        		System.out.println("Use the keys a(left), d(right), s(rotate), f(drop) q(exit) to move the pieces: ");
	        		x = in.nextLine();
	        		
	        		if(x.equals("a")){
	        			tetramino.moveLeft(game.board);
	        			result = tetramino.moveDown(game.board);
	        		}
	        		else if(x.equals("d")){
	        			tetramino.moveRight(game.board);
	        			result = tetramino.moveDown(game.board);
	        		}
	        		else if(x.equals("s")){
	        			tetramino.rotate(game.board);
	        			result = tetramino.moveDown(game.board);
	        		}
	        		else if(x.equals("f")){
	        			tetramino.drop(game.board);
	        		}
	        		else if(x.equals("q")){
	        			keepRunning = false;
	        		}
	        		else
	            		result = tetramino.moveDown(game.board);
	        		
	        		System.out.println(game.board.getBoardPrint(""));
	        		
	        		if(result == false)
	        			tetramino = randomTetramino(game);
	        		
	        	    Number value = game.board.checkRows();
	        	    if (value.longValue() > 0L) {
	            		System.out.println(game.board.getBoardPrint(""));
	        	    }
	            }
	            catch (Exception e) {}
	        }
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