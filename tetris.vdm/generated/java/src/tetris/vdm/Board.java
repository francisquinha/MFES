package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private String print_startTag = "▕";
  private String print_endTag = "▏\n";
  private String print_bottomLine = " ▔▔▔▔▔▔▔▔▔▔▔";
  private String print_empty_cell = "░";
  private String print_filledcell = "█";
  private String print_board = "";
  private Number totalRows = 20L;
  private Number totalColumns = 10L;
  private Number iterator = 0L;
  private VDMMap matrix = MapUtil.map();
  private VDMMap tempMatrix = MapUtil.map();
  private Number empty_cell = 0L;
  private Number blocked_cell = 1L;
  private Number move_cell = 111L;
  private Number pieceOperation = 0L;

  public void cg_init_Board_1() {

    this.initBoard("matrix");
    tempMatrix = Utils.copy(matrix);
  }

  public Board() {

    cg_init_Board_1();
  }

  public void initBoard(final String option) {

    if (Utils.equals(option, "matrix")) {
      long toVar_2 = totalRows.longValue();

      for (Long i = 0L; i <= toVar_2; i++) {
        long toVar_1 = totalColumns.longValue();

        for (Long j = 0L; j <= toVar_1; j++) {
          matrix =
              MapUtil.override(Utils.copy(matrix), MapUtil.map(new Maplet(SeqUtil.seq(i, j), 0L)));
        }
      }

    } else if (Utils.equals(option, "tempMatrix")) {
      long toVar_4 = totalRows.longValue();

      for (Long i = 0L; i <= toVar_4; i++) {
        long toVar_3 = totalColumns.longValue();

        for (Long j = 0L; j <= toVar_3; j++) {
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
    long toVar_6 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_6; i++) {
      print_board = print_board + print_startTag;
      long toVar_5 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_5; j++) {
        Boolean orResult_1 = false;

        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
          orResult_1 = true;
        } else {
          orResult_1 = Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), blocked_cell);
        }

        if (orResult_1) {
          print_board = print_board + print_filledcell;
        } else {
          print_board = print_board + print_empty_cell;
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
    long toVar_8 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_8; i++) {
      long toVar_7 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_7; j++) {
        Boolean orResult_2 = false;

        Boolean andResult_1 = false;

        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(totalRows, j))), move_cell)) {
            andResult_1 = true;
          }
        }

        if (andResult_1) {
          orResult_2 = true;
        } else {
          Boolean andResult_2 = false;

          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            if (Utils.equals(
                ((Number) Utils.get(matrix, SeqUtil.seq(i.longValue() + 1L, j))), blocked_cell)) {
              andResult_2 = true;
            }
          }

          orResult_2 = andResult_2;
        }

        if (orResult_2) {
          block = true;
        }
      }
    }
    if (Utils.equals(block, true)) {
      long toVar_10 = totalRows.longValue();

      for (Long i = 0L; i <= toVar_10; i++) {
        long toVar_9 = totalColumns.longValue();

        for (Long j = 0L; j <= toVar_9; j++) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            Utils.mapSeqUpdate(matrix, SeqUtil.seq(i, j), blocked_cell);
          }
        }
      }
    }

    tempMatrix = Utils.copy(matrix);
    long toVar_12 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_12; i++) {
      long toVar_11 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_11; j++) {
        if (Utils.equals(((Number) Utils.get(tempMatrix, SeqUtil.seq(i, j))), move_cell)) {
          Utils.mapSeqUpdate(tempMatrix, SeqUtil.seq(i, j), empty_cell);
        }
      }
    }
  }

  public Boolean cell_automaticallyMovePiece() {

    this.checkBoard();
    long toVar_14 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_14; i++) {
      long toVar_13 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_13; j++) {
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
      long toVar_16 = totalRows.longValue();

      for (Long i = 0L; i <= toVar_16; i++) {
        long toVar_15 = totalColumns.longValue();

        for (Long j = 0L; j <= toVar_15; j++) {
          if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), move_cell)) {
            Utils.mapSeqUpdate(
                tempMatrix, SeqUtil.seq(i, j.longValue() + numberOfClicks.longValue()), move_cell);
          }
        }
      }

    } else if (Utils.equals(option, "moveLeft")) {
      long toVar_18 = totalRows.longValue();

      for (Long i = 0L; i <= toVar_18; i++) {
        long toVar_17 = totalColumns.longValue();

        for (Long j = 0L; j <= toVar_17; j++) {
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

    throw new UnsupportedOperationException();
  }

  public void setMatrixPosition(final VDMSeq position, final Number value) {

    Utils.mapSeqUpdate(matrix, Utils.copy(position), value);
  }

  public Number getMatrixPosition(final VDMSeq position) {

    return ((Number) Utils.get(matrix, position));
  }

  public void setGameOver() {

    throw new UnsupportedOperationException();
  }

  public String toString() {

    return "Board{"
        + "print_startTag := "
        + Utils.toString(print_startTag)
        + ", print_endTag := "
        + Utils.toString(print_endTag)
        + ", print_bottomLine := "
        + Utils.toString(print_bottomLine)
        + ", print_empty_cell := "
        + Utils.toString(print_empty_cell)
        + ", print_filledcell := "
        + Utils.toString(print_filledcell)
        + ", print_board := "
        + Utils.toString(print_board)
        + ", totalRows := "
        + Utils.toString(totalRows)
        + ", totalColumns := "
        + Utils.toString(totalColumns)
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
        + "}";
  }
}
