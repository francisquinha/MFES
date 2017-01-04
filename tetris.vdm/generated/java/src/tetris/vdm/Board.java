package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private String print_startTag = "▕";
  private String print_endTag = "▏\n";
  private String print_bottomLine = " ▔▔▔▔▔▔▔▔▔▔";
  private String print_emptyCell = "░";
  private String print_filledCell = "[31m" + "█" + "[0m";
  private Number maxRow = 22L;
  private Number maxVisibleRow = 20L;
  private Number maxColumn = 10L;
  private VDMMap matrix = MapUtil.map();
  private Boolean gameOver = false;

  public void cg_init_Board_1() {

    this.initBoard();
  }

  public Board() {

    cg_init_Board_1();
  }

  public void initBoard() {

    long toVar_2 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_2; i++) {
      long toVar_1 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_1; j++) {
        matrix =
            MapUtil.override(Utils.copy(matrix), MapUtil.map(new Maplet(SeqUtil.seq(i, j), 0L)));
      }
    }
  }

  public String getBoardPrint(final String option) {

    String print_board = "\n";
    long toVar_4 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_4; i++) {
      print_board = print_board + print_startTag;
      long toVar_3 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_3; j++) {
        if (((Number) Utils.get(matrix, SeqUtil.seq(i, j))).longValue() > 0L) {
          print_board = print_board + print_filledCell;
        } else {
          if (i.longValue() < 3L) {
            print_board = print_board + " ";
          } else {
            print_board = print_board + print_emptyCell;
          }
        }
      }
      print_board = print_board + print_endTag;
    }
    if (Utils.equals(option, "printBoard")) {
      IO.println(print_board + print_bottomLine);
    }

    return print_board + print_bottomLine;
  }

  public VDMMap getBoard(final String option) {

    if (Utils.equals(option, "printMatrix")) {
      IO.println(this.matrix);
    }

    return this.matrix;
  }

  public Boolean checkRow(final Number row) {

    long toVar_5 = maxColumn.longValue();

    for (Long column = 1L; column <= toVar_5; column++) {
      if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(row, column))), 0L)) {
        return false;
      }
    }
    long toVar_7 = 1L;
    long byVar_1 = -1L;
    for (Long i = row.longValue() - 1L; byVar_1 < 0 ? i >= toVar_7 : i <= toVar_7; i += byVar_1) {
      long toVar_6 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_6; j++) {
        Utils.mapSeqUpdate(
            matrix,
            SeqUtil.seq(i.longValue() + 1L, j),
            ((Number) Utils.get(matrix, SeqUtil.seq(i, j))));
      }
    }
    return true;
  }

  public Number checkRows() {

    Number result = 0L;
    long toVar_8 = maxRow.longValue();

    for (Long row = 1L; row <= toVar_8; row++) {
      if (checkRow(row)) {
        result = result.longValue() + 1L;
      }
    }
    return result;
  }

  public void setMatrixPosition(final VDMSeq position, final Number value) {

    Utils.mapSeqUpdate(matrix, Utils.copy(position), value);
  }

  public Number getMatrixPosition(final VDMSeq position) {

    return ((Number) Utils.get(matrix, position));
  }

  public void setGameOver() {

    gameOver = true;
  }

  public Boolean getGameOver() {

    return gameOver;
  }

  public Number getMaxRow() {

    return maxRow;
  }

  public Number getMaxVisibleRow() {

    return maxVisibleRow;
  }

  public Number getMaxColumn() {

    return maxColumn;
  }

  public Tetramino addTetramino() {

    Tetramino tetramino = null;
    Number random = MATH.rand(7L).longValue() + 1L;
    Number intPattern_1 = random;
    Boolean success_1 = Utils.equals(intPattern_1, 1L);

    if (!(success_1)) {
      Number intPattern_2 = random;
      success_1 = Utils.equals(intPattern_2, 2L);

      if (!(success_1)) {
        Number intPattern_3 = random;
        success_1 = Utils.equals(intPattern_3, 3L);

        if (!(success_1)) {
          Number intPattern_4 = random;
          success_1 = Utils.equals(intPattern_4, 4L);

          if (!(success_1)) {
            Number intPattern_5 = random;
            success_1 = Utils.equals(intPattern_5, 5L);

            if (!(success_1)) {
              Number intPattern_6 = random;
              success_1 = Utils.equals(intPattern_6, 6L);

              if (!(success_1)) {
                Number intPattern_7 = random;
                success_1 = Utils.equals(intPattern_7, 7L);

                if (success_1) {
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

    return tetramino;
  }

  public String toString() {

    return "Board{"
        + "print_startTag := "
        + Utils.toString(print_startTag)
        + ", print_endTag := "
        + Utils.toString(print_endTag)
        + ", print_bottomLine := "
        + Utils.toString(print_bottomLine)
        + ", print_emptyCell := "
        + Utils.toString(print_emptyCell)
        + ", print_filledCell := "
        + Utils.toString(print_filledCell)
        + ", maxRow := "
        + Utils.toString(maxRow)
        + ", maxVisibleRow := "
        + Utils.toString(maxVisibleRow)
        + ", maxColumn := "
        + Utils.toString(maxColumn)
        + ", matrix := "
        + Utils.toString(matrix)
        + ", gameOver := "
        + Utils.toString(gameOver)
        + "}";
  }
}
