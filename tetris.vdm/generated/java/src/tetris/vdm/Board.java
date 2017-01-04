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
  private String print_board = "";
  private Number maxRow = 22L;
  private Number visibleRows = 20L;
  private Number maxColumn = 10L;
  private Number iterator = 0L;
  private VDMMap matrix = MapUtil.map();
  private VDMMap tempMatrix = MapUtil.map();
  private Number empty_cell = 0L;
  private Number blocked_cell = 1L;
  private Number move_cell = 111L;
  private Number pieceOperation = 0L;
  private Boolean gameOver = false;

  public void cg_init_Board_1() {

    this.initBoard("matrix");
    tempMatrix = Utils.copy(matrix);
  }

  public Board() {

    cg_init_Board_1();
  }

  public void initBoard(final String option) {

    if (Utils.equals(option, "matrix")) {
      long toVar_2 = maxRow.longValue();

      for (Long i = 1L; i <= toVar_2; i++) {
        long toVar_1 = maxColumn.longValue();

        for (Long j = 1L; j <= toVar_1; j++) {
          matrix =
              MapUtil.override(Utils.copy(matrix), MapUtil.map(new Maplet(SeqUtil.seq(i, j), 0L)));
        }
      }

    } else if (Utils.equals(option, "tempMatrix")) {
      long toVar_4 = maxRow.longValue();

      for (Long i = 1L; i <= toVar_4; i++) {
        long toVar_3 = maxColumn.longValue();

        for (Long j = 1L; j <= toVar_3; j++) {
          if (!(Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), blocked_cell))) {
            tempMatrix =
                MapUtil.override(
                    Utils.copy(tempMatrix), MapUtil.map(new Maplet(SeqUtil.seq(i, j), 0L)));
          }
        }
      }
    }
  }

  public String getBoardPrint(final String option) {

    print_board = "\n";
    long toVar_6 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_6; i++) {
      print_board = print_board + print_startTag;
      long toVar_5 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_5; j++) {
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

  public void cell_setPiece(
      final String option,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4) {

    {
      if (Utils.equals(option, "set")) {
        pieceOperation = move_cell;
      } else if (Utils.equals(option, "remove")) {
        pieceOperation = empty_cell;
      }
    }

    matrix =
        MapUtil.override(
            Utils.copy(matrix), MapUtil.map(new Maplet(Utils.copy(coord1), pieceOperation)));
    matrix =
        MapUtil.override(
            Utils.copy(matrix), MapUtil.map(new Maplet(Utils.copy(coord2), pieceOperation)));
    matrix =
        MapUtil.override(
            Utils.copy(matrix), MapUtil.map(new Maplet(Utils.copy(coord3), pieceOperation)));
    matrix =
        MapUtil.override(
            Utils.copy(matrix), MapUtil.map(new Maplet(Utils.copy(coord4), pieceOperation)));
  }

  public void checkBoard() {

    Boolean block = false;
    long toVar_8 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_8; i++) {
      long toVar_7 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_7; j++) {
        Boolean orResult_1 = false;

        Boolean andResult_1 = false;

        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(maxRow, j))), move_cell)) {
            andResult_1 = true;
          }
        }

        if (andResult_1) {
          orResult_1 = true;
        } else {
          Boolean andResult_2 = false;

          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            if (Utils.equals(
                ((Number) Utils.get(matrix, SeqUtil.seq(i.longValue() + 1L, j))), blocked_cell)) {
              andResult_2 = true;
            }
          }

          orResult_1 = andResult_2;
        }

        if (orResult_1) {
          block = true;
        }
      }
    }
    if (Utils.equals(block, true)) {
      long toVar_10 = maxRow.longValue();

      for (Long i = 1L; i <= toVar_10; i++) {
        long toVar_9 = maxColumn.longValue();

        for (Long j = 1L; j <= toVar_9; j++) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            Utils.mapSeqUpdate(matrix, SeqUtil.seq(i, j), blocked_cell);
          }
        }
      }
    }

    tempMatrix = Utils.copy(matrix);
    long toVar_12 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_12; i++) {
      long toVar_11 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_11; j++) {
        if (Utils.equals(((Number) Utils.get(tempMatrix, SeqUtil.seq(i, j))), move_cell)) {
          Utils.mapSeqUpdate(tempMatrix, SeqUtil.seq(i, j), empty_cell);
        }
      }
    }
  }

  public Boolean cell_automaticallyMovePiece() {

    this.checkBoard();
    long toVar_14 = maxRow.longValue();

    for (Long i = 1L; i <= toVar_14; i++) {
      long toVar_13 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_13; j++) {
        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
          Utils.mapSeqUpdate(tempMatrix, SeqUtil.seq(i.longValue() + 1L, j), move_cell);
        }
      }
    }
    matrix = Utils.copy(tempMatrix);
    return true;
  }

  public void cell_manuallyMovePiece(final String option, final Number numberOfClicks) {

    this.checkBoard();
    if (Utils.equals(option, "moveRight")) {
      long toVar_16 = maxRow.longValue();

      for (Long i = 1L; i <= toVar_16; i++) {
        long toVar_15 = maxColumn.longValue();

        for (Long j = 1L; j <= toVar_15; j++) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            Utils.mapSeqUpdate(
                tempMatrix, SeqUtil.seq(i, j.longValue() + numberOfClicks.longValue()), move_cell);
          }
        }
      }

    } else if (Utils.equals(option, "moveLeft")) {
      long toVar_18 = maxRow.longValue();

      for (Long i = 1L; i <= toVar_18; i++) {
        long toVar_17 = maxColumn.longValue();

        for (Long j = 1L; j <= toVar_17; j++) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            Utils.mapSeqUpdate(
                tempMatrix, SeqUtil.seq(i, j.longValue() - numberOfClicks.longValue()), move_cell);
          }
        }
      }
    }

    matrix = Utils.copy(tempMatrix);
  }

  public Boolean checkRow(final Number row) {

    long toVar_19 = maxColumn.longValue();

    for (Long column = 1L; column <= toVar_19; column++) {
      if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(row, column))), 0L)) {
        return false;
      }
    }
    long toVar_21 = 1L;
    long byVar_1 = -1L;
    for (Long i = row.longValue() - 1L; byVar_1 < 0 ? i >= toVar_21 : i <= toVar_21; i += byVar_1) {
      long toVar_20 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_20; j++) {
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
    long toVar_22 = maxRow.longValue();

    for (Long row = 1L; row <= toVar_22; row++) {
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
        + ", print_board := "
        + Utils.toString(print_board)
        + ", maxRow := "
        + Utils.toString(maxRow)
        + ", visibleRows := "
        + Utils.toString(visibleRows)
        + ", maxColumn := "
        + Utils.toString(maxColumn)
        + ", iterator := "
        + Utils.toString(iterator)
        + ", matrix := "
        + Utils.toString(matrix)
        + ", tempMatrix := "
        + Utils.toString(tempMatrix)
        + ", empty_cell := "
        + Utils.toString(empty_cell)
        + ", blocked_cell := "
        + Utils.toString(blocked_cell)
        + ", move_cell := "
        + Utils.toString(move_cell)
        + ", pieceOperation := "
        + Utils.toString(pieceOperation)
        + ", gameOver := "
        + Utils.toString(gameOver)
        + "}";
  }
}
