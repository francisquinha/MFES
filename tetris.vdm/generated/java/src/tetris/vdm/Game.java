package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Game {
  private Number level = 0L;
  private Board board = new Board();

  public void startGame() {

    IO.print("# call 'Game:startGame'\n");
    board.initBoard();
  }

  public Number endGame() {

    throw new UnsupportedOperationException();
  }

  public Game() {}

  public String toString() {

    return "Game{"
        + "level := "
        + Utils.toString(level)
        + ", board := "
        + Utils.toString(board)
        + "}";
  }
}
