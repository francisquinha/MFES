package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Game {
  private Board board;
  private Tetramino tetramino;
  private Boolean gameOver = false;
  private Number score = 0L;
  private Number lines = 0L;
  private Number level = 1L;
  private VDMSeq lineScores = SeqUtil.seq(100L, 300L, 400L, 800L);

  public void cg_init_Game_1() {

    board = new Board();
  }

  public Game() {

    cg_init_Game_1();
  }

  public Board getBoard() {

    return board;
  }

  public void setGameOver() {

    gameOver = true;
  }

  public Boolean getGameOver() {

    return gameOver;
  }

  public void newTetramino(final Number id) {

    Number intPattern_9 = id;
    Boolean success_3 = Utils.equals(intPattern_9, 1L);

    if (!(success_3)) {
      Number intPattern_10 = id;
      success_3 = Utils.equals(intPattern_10, 2L);

      if (!(success_3)) {
        Number intPattern_11 = id;
        success_3 = Utils.equals(intPattern_11, 3L);

        if (!(success_3)) {
          Number intPattern_12 = id;
          success_3 = Utils.equals(intPattern_12, 4L);

          if (!(success_3)) {
            Number intPattern_13 = id;
            success_3 = Utils.equals(intPattern_13, 5L);

            if (!(success_3)) {
              Number intPattern_14 = id;
              success_3 = Utils.equals(intPattern_14, 6L);

              if (!(success_3)) {
                Number intPattern_15 = id;
                success_3 = Utils.equals(intPattern_15, 7L);

                if (success_3) {
                  tetramino = new TetraminoZ(this);
                }

              } else {
                tetramino = new TetraminoT(this);
              }

            } else {
              tetramino = new TetraminoS(this);
            }

          } else {
            tetramino = new TetraminoO(this);
          }

        } else {
          tetramino = new TetraminoL(this);
        }

      } else {
        tetramino = new TetraminoJ(this);
      }

    } else {
      tetramino = new TetraminoI(this);
    }
  }

  public void newRandomTetramino() {

    newTetramino(MATH.rand(7L).longValue() + 1L);
  }

  private void incScore(final Number inc) {

    score = score.longValue() + inc.longValue();
  }

  public Boolean down() {

    return tetramino.moveDown(board);
  }

  public Boolean left() {

    return tetramino.moveLeft(board);
  }

  public Boolean right() {

    return tetramino.moveRight(board);
  }

  public Boolean rotate() {

    return tetramino.rotate(board);
  }

  public Number drop() {

    Number dropDistance = tetramino.drop(board);
    score = score.longValue() + dropDistance.longValue() * level.longValue();
    return dropDistance;
  }

  public Number checkLines() {

    Number newLines = board.checkRows();
    lines = lines.longValue() + newLines.longValue();
    if (newLines.longValue() > 0L) {
      score =
          score.longValue()
              + ((Number) Utils.get(lineScores, newLines)).longValue() * level.longValue();
    }

    level = 1L + Utils.div(lines.longValue(), 10L);
    return newLines;
  }

  public Number getScore() {

    return score;
  }

  public Number getLines() {

    return lines;
  }

  public Number getLevel() {

    return level;
  }

  public String printBoard(
      final Boolean printNow, final Boolean blackConsole, final Boolean testPrint) {

    return board.getBoardPrint(printNow, blackConsole, testPrint);
  }

  public String toString() {

    return "Game{"
        + "board := "
        + Utils.toString(board)
        + ", tetramino := "
        + Utils.toString(tetramino)
        + ", gameOver := "
        + Utils.toString(gameOver)
        + ", score := "
        + Utils.toString(score)
        + ", lines := "
        + Utils.toString(lines)
        + ", level := "
        + Utils.toString(level)
        + ", lineScores := "
        + Utils.toString(lineScores)
        + "}";
  }
}
