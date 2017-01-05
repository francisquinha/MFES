package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestTetris extends TestCaseExtra {
  public String printBoard = "";

  private void initalMatrix_test(final Game game) {

    printBoard = game.printBoard(true, false, true);
  }

  private void addTetramino_test(final Game game, final Number id) {

    game.newTetramino(id);
    printBoard = game.printBoard(true, false, true);
  }

  private void dropTetramino_test(final Game game) {

    Number value = game.drop();
    if (value.longValue() > 0L) {
      printBoard = game.printBoard(true, false, true);
      IO.println(game.getScore());
      IO.println(game.getLines());
      IO.println(game.getLevel());
    }
  }

  private void downTetramino_test(final Game game) {

    Boolean result = game.down();
    printBoard = game.printBoard(true, false, true);
  }

  private void rightTetramino_test(final Game game) {

    Boolean result = game.right();
    printBoard = game.printBoard(true, false, true);
  }

  private void leftTetramino_test(final Game game) {

    Boolean result = game.left();
    printBoard = game.printBoard(true, false, true);
  }

  private void rotateTetramino_test(final Game game) {

    Boolean result = game.rotate();
    printBoard = game.printBoard(true, false, true);
  }

  private void checkLines_test(final Game game) {

    Number value = game.checkLines();
    if (value.longValue() > 0L) {
      printBoard = game.printBoard(true, false, true);
      IO.println(game.getScore());
      IO.println(game.getLines());
      IO.println(game.getLevel());
    }
  }

  private void addRandomTetramino_test(final Game game) {

    game.newRandomTetramino();
    printBoard = game.printBoard(true, false, true);
  }

  public static void main() {

    Game game = new Game();
    Number testInt = 0L;
    IO.print("\n##### TESTS #####\n");
    new TestTetris().initalMatrix_test(game);
    new TestTetris().addTetramino_test(game, 1L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 2L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 3L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 4L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 5L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 6L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().rightTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 7L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
    new TestTetris().addTetramino_test(game, 5L);
    new TestTetris().downTetramino_test(game);
    new TestTetris().downTetramino_test(game);
    new TestTetris().rotateTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().leftTetramino_test(game);
    new TestTetris().dropTetramino_test(game);
  }

  public TestTetris() {}

  public String toString() {

    return "TestTetris{" + "printBoard := " + Utils.toString(printBoard) + "}";
  }
}
