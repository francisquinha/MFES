package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tests {
  private Game game = new Game();

  private void gameType1() {

    game.startGame();
  }

  public static void main() {

    IO.print("\n# INIT TESTS\n\n");
    new Tests().gameType1();
  }

  public Tests() {}

  public String toString() {

    return "Tests{" + "game := " + Utils.toString(game) + "}";
  }
}
