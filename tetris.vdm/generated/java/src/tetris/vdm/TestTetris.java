package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestTetris extends TestCaseExtra {
  public String printBoard = "";

  private void initalMatrix_test(final Game game) {

    printBoard = game.board.getBoardPrint("printBoard");
  }

  private Tetramino addTetramino_test(final Game game, final Number id) {

    Tetramino tetramino = null;
    Number intPattern_8 = id;
    Boolean success_2 = Utils.equals(intPattern_8, 1L);

    if (!(success_2)) {
      Number intPattern_9 = id;
      success_2 = Utils.equals(intPattern_9, 2L);

      if (!(success_2)) {
        Number intPattern_10 = id;
        success_2 = Utils.equals(intPattern_10, 3L);

        if (!(success_2)) {
          Number intPattern_11 = id;
          success_2 = Utils.equals(intPattern_11, 4L);

          if (!(success_2)) {
            Number intPattern_12 = id;
            success_2 = Utils.equals(intPattern_12, 5L);

            if (!(success_2)) {
              Number intPattern_13 = id;
              success_2 = Utils.equals(intPattern_13, 6L);

              if (!(success_2)) {
                Number intPattern_14 = id;
                success_2 = Utils.equals(intPattern_14, 7L);

                if (success_2) {
                  tetramino = new TetraminoZ(game.board);
                }

              } else {
                tetramino = new TetraminoT(game.board);
              }

            } else {
              tetramino = new TetraminoS(game.board);
            }

          } else {
            tetramino = new TetraminoO(game.board);
          }

        } else {
          tetramino = new TetraminoL(game.board);
        }

      } else {
        tetramino = new TetraminoJ(game.board);
      }

    } else {
      tetramino = new TetraminoI(game.board);
    }

    printBoard = game.board.getBoardPrint("printBoard");
    return tetramino;
  }

  private void dropTetramino_test(final Game game, final Tetramino tetramino) {

    Number value = tetramino.drop(game.board);
    if (value.longValue() > 0L) {
      printBoard = game.board.getBoardPrint("printBoard");
    }
  }

  private void downTetramino_test(final Game game, final Tetramino tetramino) {

    Boolean result = tetramino.moveDown(game.board);
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void rightTetramino_test(final Game game, final Tetramino tetramino) {

    Boolean result = tetramino.moveRight(game.board);
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void leftTetramino_test(final Game game, final Tetramino tetramino) {

    Boolean result = tetramino.moveLeft(game.board);
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void rotateTetramino_test(final Game game, final Tetramino tetramino) {

    Boolean result = tetramino.rotate(game.board);
    printBoard = game.board.getBoardPrint("printBoard");
  }

  private void checkRows_test(final Game game) {

    Number value = game.board.checkRows();
    if (value.longValue() > 0L) {
      printBoard = game.board.getBoardPrint("printBoard");
    }
  }

  private Tetramino addRandomTetramino_test(final Game game) {

    Tetramino tetramino = game.board.addTetramino();
    printBoard = game.board.getBoardPrint("printBoard");
    return tetramino;
  }

  public static void main() {

    Game game = new Game();
    Tetramino tetramino = null;
    Number testInt = 0L;
    IO.print("\n##### TESTS #####\n");
    new TestTetris().initalMatrix_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 1L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 2L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 3L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 4L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 5L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 6L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().rightTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 7L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    tetramino = new TestTetris().addTetramino_test(game, 5L);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().downTetramino_test(game, tetramino);
    new TestTetris().rotateTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().leftTetramino_test(game, tetramino);
    new TestTetris().dropTetramino_test(game, tetramino);
    new TestTetris().checkRows_test(game);
    Boolean whileCond_1 = true;
    while (whileCond_1) {
      whileCond_1 = !(game.board.getGameOver());
      if (!(whileCond_1)) {
        break;
      }

      {
        tetramino = new TestTetris().addRandomTetramino_test(game);
        if (Utils.equals(testInt, 0L)) {
          new TestTetris().leftTetramino_test(game, tetramino);
          new TestTetris().leftTetramino_test(game, tetramino);
          new TestTetris().leftTetramino_test(game, tetramino);

        } else {
          if (Utils.equals(testInt, 2L)) {
            new TestTetris().rightTetramino_test(game, tetramino);
            new TestTetris().rightTetramino_test(game, tetramino);
            new TestTetris().rightTetramino_test(game, tetramino);
            new TestTetris().rightTetramino_test(game, tetramino);
          }
        }

        new TestTetris().dropTetramino_test(game, tetramino);
        new TestTetris().checkRows_test(game);
        testInt = Utils.mod(testInt.longValue() + 1L, 3L);
      }
    }
  }

  public TestTetris() {}

  public String toString() {

    return "TestTetris{" + "printBoard := " + Utils.toString(printBoard) + "}";
  }
}
