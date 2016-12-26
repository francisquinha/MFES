package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Game {
  public Number level = 0L;
  public Board board;

  public void cg_init_Game_1() {

    board = new Board();
  }

  public Game() {

    cg_init_Game_1();
  }

  public Number endGame() {

    throw new UnsupportedOperationException();
  }

  public String toString() {

    return "Game{"
        + "level := "
        + Utils.toString(level)
        + ", board := "
        + Utils.toString(board)
        + "}";
  }
}
