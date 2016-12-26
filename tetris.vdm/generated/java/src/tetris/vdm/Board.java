package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private String print_startTag = "▕";
  private String print_endTag = "▏\n";
  private String print_bottomLine = " ▔▔▔▔▔▔▔▔▔▔▔▔";
  private String print_emptyCell = "░";
  private String print_filledcell = "█";
  private String print_board = "";
  private Number totalRows = 11L;
  private Number totalColumns = 11L;
  private Number iterator = 0L;
  private VDMMap matrix = MapUtil.map();
  private VDMMap tempMatrix = MapUtil.map();
  private Number emptyCell = 0L;
  private Number forMoveCell = 1L;
  private Number filledCell = 2L;
  private Number tempCell = 9L;

  public void cg_init_Board_1() {

    this.initBoard("matrix");
  }

  public Board() {

    cg_init_Board_1();
  }

  public void initBoard(final String option) {

    {
      if (Utils.equals(option, "matrix")) {
        long toVar_2 = totalRows.longValue();

        for (Long x = 0L; x <= toVar_2; x++) {
          long toVar_1 = totalColumns.longValue();

          for (Long y = 0L; y <= toVar_1; y++) {
            matrix =
                MapUtil.override(
                    Utils.copy(matrix), MapUtil.map(new Maplet(SeqUtil.seq(x, y), 0L)));
          }
        }
      } else if (Utils.equals(option, "tempMatrix")) {
        long toVar_4 = totalRows.longValue();

        for (Long x = 0L; x <= toVar_4; x++) {
          long toVar_3 = totalColumns.longValue();

          for (Long y = 0L; y <= toVar_3; y++) {
            tempMatrix =
                MapUtil.override(
                    Utils.copy(tempMatrix), MapUtil.map(new Maplet(SeqUtil.seq(x, y), 0L)));
          }
        }
      }
    }
  }

  public String getBoardPrint() {

    print_board = "\n";
    long toVar_6 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_6; i++) {
      print_board = print_board + print_startTag;
      long toVar_5 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_5; j++) {
        Boolean orResult_1 = false;

        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), forMoveCell)) {
          orResult_1 = true;
        } else {
          orResult_1 = Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), filledCell);
        }

        if (orResult_1) {
          print_board = print_board + print_filledcell;
        } else {
          print_board = print_board + print_emptyCell;
        }
      }
      print_board = print_board + print_endTag;
    }
    return print_board + print_bottomLine;
  }

  public VDMMap getBoard() {

    return this.matrix;
  }

  public void cell_setPiece(
      final String option,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4) {

    Cell cell = new Cell();
    matrix =
        cell.setPiece(
            option,
            Utils.copy(coord1),
            Utils.copy(coord2),
            Utils.copy(coord3),
            Utils.copy(coord4),
            Utils.copy(matrix));
  }

  public void cell_automaticallyMovePiece() {

    Cell cell = new Cell();
    this.initBoard("tempMatrix");
    matrix = cell.automaticallyMovePiece(Utils.copy(tempMatrix), Utils.copy(matrix));
  }

  public void cell_manuallyMovePiece(final String option, final Number numberOfClicks) {

    Cell cell = new Cell();
    this.initBoard("tempMatrix");
    matrix =
        cell.manuallyMovePiece(option, numberOfClicks, Utils.copy(tempMatrix), Utils.copy(matrix));
  }

  public Boolean checkRow(final Number row) {

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
        + ", print_emptyCell := "
        + Utils.toString(print_emptyCell)
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
        + ", emptyCell := "
        + Utils.toString(emptyCell)
        + ", forMoveCell := "
        + Utils.toString(forMoveCell)
        + ", filledCell := "
        + Utils.toString(filledCell)
        + ", tempCell := "
        + Utils.toString(tempCell)
        + "}";
  }
}
