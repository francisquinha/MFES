package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestTetris extends TestCaseExtra {
  public VDMMap matrix = MapUtil.map();
  public String printBoard = "";

  private void initalMatrix_test(final Game game) {

    IO.println("-> Initial matrix");
    matrix = game.board.getBoard("printMatrix");
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void addPiece_test(
      final Game game,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4) {

    IO.println("-> Add piece on the matrix");
    game.board.cell_setPiece(
        "set", Utils.copy(coord1), Utils.copy(coord2), Utils.copy(coord3), Utils.copy(coord4));
    matrix = game.board.getBoard("printMatrix");
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void automaticallyMovePiece_test(
      final Game game, final Number totalTime, final Number step) {

    Timer timer = new Timer();
    Boolean endLoop = false;
    Boolean movePiece = true;
    IO.println("-> Move piece automatically (dummy timer)");
    Boolean whileCond_1 = true;
    while (whileCond_1) {
      whileCond_1 = !(endLoop);
      if (!(whileCond_1)) {
        break;
      }

      {
        timer.incTimers();
        if (Utils.equals(timer.getTimer("time"), 180000L * totalTime.longValue())) {
          timer.resetTimer("all");
          endLoop = true;
        }

        if (Utils.equals(timer.getTimer("step"), 4000L * step.longValue())) {
          movePiece = game.board.cell_automaticallyMovePiece();
          matrix = game.board.getBoard("printMatrix");
          printBoard = game.board.getBoardPrint("printBoard");
          timer.resetTimer("step");
        }
      }
    }
  }

  private void manuallyMovePiece_test(final Game game) {

    IO.println("-> Move piece manually (keyboard click simulation)");
    game.board.cell_manuallyMovePiece("moveRight", 8L);
    matrix = game.board.getBoard("printMatrix");
    printBoard = game.board.getBoardPrint("printBoard");
  }

  public static void main() {

    Game game = new Game();
    IO.print("\n##### TESTS #####\n");
    IO.println("# Test 1 - Add random piece; move the piece manually/automatically\n");
    new TestTetris().initalMatrix_test(game);
  }

  public TestTetris() {}

  public String toString() {

    return "TestTetris{"
        + "matrix := "
        + Utils.toString(matrix)
        + ", printBoard := "
        + Utils.toString(printBoard)
        + "}";
  }
}
