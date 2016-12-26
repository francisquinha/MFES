package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestTetris extends TestCaseExtra {
  public VDMMap matrix = MapUtil.map();
  public String printBoard = "";
  public Boolean endGame = false;

  private void addPiece_test() {

    Game game1 = new Game();
    IO.println("# Test 1 - Add random piece; move the piece manually/automatically\n");
    IO.println("-> Initial matrix");
    matrix = game1.board.getBoard();
    IO.println(Utils.copy(matrix));
    printBoard = game1.board.getBoardPrint();
    IO.println(printBoard);
    IO.println("-> Add piece on the matrix");
    game1.board.cell_setPiece(
        "set", SeqUtil.seq(0L, 2L), SeqUtil.seq(1L, 2L), SeqUtil.seq(2L, 2L), SeqUtil.seq(3L, 2L));
    matrix = game1.board.getBoard();
    IO.println(Utils.copy(matrix));
    printBoard = game1.board.getBoardPrint();
    IO.println(printBoard);
    IO.println("-> Move piece automatically");
    game1.board.cell_automaticallyMovePiece();
    matrix = game1.board.getBoard();
    IO.println(Utils.copy(matrix));
    printBoard = game1.board.getBoardPrint();
    IO.println(printBoard);
    IO.println("-> Move piece automatically (second call)");
    game1.board.cell_automaticallyMovePiece();
    matrix = game1.board.getBoard();
    IO.println(Utils.copy(matrix));
    printBoard = game1.board.getBoardPrint();
    IO.println(printBoard);
    IO.println("-> Move piece manually (keyboard click simulation)");
    game1.board.cell_manuallyMovePiece("moveRight", 8L);
    matrix = game1.board.getBoard();
    IO.println(Utils.copy(matrix));
    printBoard = game1.board.getBoardPrint();
    IO.println(printBoard);
  }

  private void timer_test() {

    Timer timer = new Timer();
    IO.print("\n# timer_test\n");
    Boolean whileCond_1 = true;
    while (whileCond_1) {
      whileCond_1 = !(endGame);
      if (!(whileCond_1)) {
        break;
      }

      {
        timer.incTimers();
        if (Utils.equals(timer.getTimer("time"), 100000L)) {
          IO.print("-> END \n");
          timer.resetTimer("all");
          endGame = true;
        }

        if (Utils.equals(timer.getTimer("step"), 20000L)) {
          IO.print("-> Matrix \n");
          timer.resetTimer("step");
        }
      }
    }
  }

  public static void main() {

    IO.print("\n##### TESTS #####\n");
    new TestTetris().addPiece_test();
  }

  public TestTetris() {}

  public String toString() {

    return "TestTetris{"
        + "matrix := "
        + Utils.toString(matrix)
        + ", printBoard := "
        + Utils.toString(printBoard)
        + ", endGame := "
        + Utils.toString(endGame)
        + "}";
  }
}
