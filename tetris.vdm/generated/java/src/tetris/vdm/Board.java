package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private String startTag = "<!";
  private String endTag = "!>\n";
  private String bottomLine = "============";
  private String emptyCell = "□";
  private String filledcell = "■";
  private Number rows = 0L;
  private Number columns = 0L;
  private String printRow = "";
  private String printBoard = "";
  private Number iterator = 1L;
  private VDMMap matrix = MapUtil.map();
  private Number pieceOperation = 0L;

  public void cg_init_Board_1() {

    this.initBoard();
  }

  public Board() {

    cg_init_Board_1();
  }

  public void initBoard() {

    long toVar_2 = 11L;

    for (Long x = 0L; x <= toVar_2; x++) {
      long toVar_1 = 11L;

      for (Long y = 0L; y <= toVar_1; y++) {
        matrix =
            MapUtil.override(Utils.copy(matrix), MapUtil.map(new Maplet(SeqUtil.seq(x, y), 0L)));
      }
    }
  }

  public String getBoardPrint(
      final String option,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4) {

    printBoard = "";
    if (Utils.equals(option, "set")) {
      long toVar_4 = 11L;

      for (Long x = 0L; x <= toVar_4; x++) {
        printBoard = printBoard + startTag;
        long toVar_3 = 11L;

        for (Long y = 0L; y <= toVar_3; y++) {
          Boolean orResult_1 = false;

          Boolean andResult_1 = false;

          if (Utils.equals(((Number) Utils.get(coord1, 1L)), x)) {
            if (Utils.equals(((Number) Utils.get(coord1, 2L)), y)) {
              andResult_1 = true;
            }
          }

          if (andResult_1) {
            orResult_1 = true;
          } else {
            Boolean orResult_2 = false;

            Boolean andResult_2 = false;

            if (Utils.equals(((Number) Utils.get(coord2, 1L)), x)) {
              if (Utils.equals(((Number) Utils.get(coord2, 2L)), y)) {
                andResult_2 = true;
              }
            }

            if (andResult_2) {
              orResult_2 = true;
            } else {
              Boolean orResult_3 = false;

              Boolean andResult_3 = false;

              if (Utils.equals(((Number) Utils.get(coord3, 1L)), x)) {
                if (Utils.equals(((Number) Utils.get(coord3, 2L)), y)) {
                  andResult_3 = true;
                }
              }

              if (andResult_3) {
                orResult_3 = true;
              } else {
                Boolean andResult_4 = false;

                if (Utils.equals(((Number) Utils.get(coord4, 1L)), x)) {
                  if (Utils.equals(((Number) Utils.get(coord4, 2L)), y)) {
                    andResult_4 = true;
                  }
                }

                orResult_3 = andResult_4;
              }

              orResult_2 = orResult_3;
            }

            orResult_1 = orResult_2;
          }

          if (orResult_1) {
            printBoard = printBoard + filledcell;
          } else {
            printBoard = printBoard + emptyCell;
          }
        }
        printBoard = printBoard + endTag;
      }
      return printBoard;

    } else if (Utils.equals(option, "init")) {
      long toVar_5 = 11L;

      for (Long x = 0L; x <= toVar_5; x++) {
        printBoard = printBoard + startTag + "□□□□□□□□□□□□" + endTag;
      }
      printBoard = printBoard + startTag + bottomLine + endTag + "\n";
      return printBoard;
    }

    return "";
  }

  public VDMMap getBoard() {

    return this.matrix;
  }

  public void setPiece(
      final String option,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4) {

    {
      if (Utils.equals(option, "set")) {
        pieceOperation = 1L;
      } else if (Utils.equals(option, "remove")) {
        pieceOperation = 0L;
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

  public Number getPiece() {

    throw new UnsupportedOperationException();
  }

  public Boolean checkRow(final Number row) {

    throw new UnsupportedOperationException();
  }

  public String toString() {

    return "Board{"
        + "startTag := "
        + Utils.toString(startTag)
        + ", endTag := "
        + Utils.toString(endTag)
        + ", bottomLine := "
        + Utils.toString(bottomLine)
        + ", emptyCell := "
        + Utils.toString(emptyCell)
        + ", filledcell := "
        + Utils.toString(filledcell)
        + ", rows := "
        + Utils.toString(rows)
        + ", columns := "
        + Utils.toString(columns)
        + ", printRow := "
        + Utils.toString(printRow)
        + ", printBoard := "
        + Utils.toString(printBoard)
        + ", iterator := "
        + Utils.toString(iterator)
        + ", matrix := "
        + Utils.toString(matrix)
        + ", pieceOperation := "
        + Utils.toString(pieceOperation)
        + "}";
  }
}
