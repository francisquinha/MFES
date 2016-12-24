package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tests {
  public VDMMap matrix = MapUtil.map();
  public String printBoard = "";

  private void addPiece_test() {

    Game game1 = new Game();
    IO.print("\n# addPiece_test\n");
    IO.print("\n-> Initial matrix\n");
    matrix = game1.board.getBoard();
    IO.print(Utils.copy(matrix));
    printBoard =
        game1.board.getBoardPrint(
            "init",
            SeqUtil.seq(0L, 0L),
            SeqUtil.seq(0L, 0L),
            SeqUtil.seq(0L, 0L),
            SeqUtil.seq(0L, 0L));
    IO.print("\n\n" + printBoard);
    IO.print("-> Add piece on the matrix\n");
    game1.board.setPiece(
        "set", SeqUtil.seq(0L, 2L), SeqUtil.seq(1L, 2L), SeqUtil.seq(2L, 2L), SeqUtil.seq(3L, 2L));
    matrix = game1.board.getBoard();
    IO.print(Utils.copy(matrix));
    printBoard =
        game1.board.getBoardPrint(
            "set",
            SeqUtil.seq(0L, 2L),
            SeqUtil.seq(1L, 2L),
            SeqUtil.seq(2L, 2L),
            SeqUtil.seq(3L, 2L));
    IO.print("\n\n" + printBoard);
  }

  public static void main() {

    IO.print("\nINIT TESTS\n");
    new Tests().addPiece_test();
  }

  public Tests() {}

  public String toString() {

    return "Tests{"
        + "matrix := "
        + Utils.toString(matrix)
        + ", printBoard := "
        + Utils.toString(printBoard)
        + "}";
  }
}
