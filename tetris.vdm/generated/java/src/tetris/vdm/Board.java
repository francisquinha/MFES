package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private String print_startTag = "▕";
  private String print_endTag = "▏\n";
  private String print_bottomLine = " ▔▔▔▔▔▔▔▔▔▔";
  private Number maxRow = 22L;
  private Number maxVisibleRow = 20L;
  private Number maxColumn = 10L;
  private VDMMap matrix = MapUtil.map();

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

  public String getBoardPrint(
      final Boolean printNow, final Boolean blackConsole, final Boolean testPrint) {

    String print_board = "\n";
    Number start_row = 3L;
    if (testPrint) {
      start_row = 1L;
    }

    long toVar_4 = maxRow.longValue();

    for (Long i = start_row.longValue(); i <= toVar_4; i++) {
      print_board = print_board + print_startTag;
      long toVar_3 = maxColumn.longValue();

      for (Long j = 1L; j <= toVar_3; j++) {
        print_board =
            print_board
                + getCellPrint(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), i, blackConsole);
      }
      print_board = print_board + print_endTag;
    }
    if (printNow) {
      IO.println(print_board + print_bottomLine);
    }

    return print_board + print_bottomLine;
  }

  private String getCellPrint(final Number id, final Number row, final Boolean blackConsole) {

    if (blackConsole) {
      Number intPattern_1 = id;
      Boolean success_1 = Utils.equals(intPattern_1, 0L);

      if (success_1) {
        if (row.longValue() < 3L) {
          return " ";

        } else {
          return "░";
        }

      } else {
        return "█";
      }

    } else {
      Number intPattern_2 = id;
      Boolean success_2 = Utils.equals(intPattern_2, 0L);

      if (!(success_2)) {
        Number intPattern_3 = id;
        success_2 = Utils.equals(intPattern_3, 1L);

        if (!(success_2)) {
          Number intPattern_4 = id;
          success_2 = Utils.equals(intPattern_4, 2L);

          if (!(success_2)) {
            Number intPattern_5 = id;
            success_2 = Utils.equals(intPattern_5, 3L);

            if (!(success_2)) {
              Number intPattern_6 = id;
              success_2 = Utils.equals(intPattern_6, 4L);

              if (!(success_2)) {
                Number intPattern_7 = id;
                success_2 = Utils.equals(intPattern_7, 5L);

                if (!(success_2)) {
                  Number intPattern_8 = id;
                  success_2 = Utils.equals(intPattern_8, 6L);

                  if (success_2) {
                    return "[38;5;165m" + "█" + "[0m";

                  } else {
                    return "[38;5;196m" + "█" + "[0m";
                  }

                } else {
                  return "[38;5;34m" + "█" + "[0m";
                }

              } else {
                return "[38;5;226m" + "█" + "[0m";
              }

            } else {
              return "[38;5;208m" + "█" + "[0m";
            }

          } else {
            return "[38;5;21m" + "█" + "[0m";
          }

        } else {
          return "[38;5;51m" + "█" + "[0m";
        }

      } else {
        if (row.longValue() < 3L) {
          return " ";

        } else {
          return "░";
        }
      }
    }
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

  public Number getMaxRow() {

    return maxRow;
  }

  public Number getMaxVisibleRow() {

    return maxVisibleRow;
  }

  public Number getMaxColumn() {

    return maxColumn;
  }

  public String toString() {

    return "Board{"
        + "print_startTag := "
        + Utils.toString(print_startTag)
        + ", print_endTag := "
        + Utils.toString(print_endTag)
        + ", print_bottomLine := "
        + Utils.toString(print_bottomLine)
        + ", maxRow := "
        + Utils.toString(maxRow)
        + ", maxVisibleRow := "
        + Utils.toString(maxVisibleRow)
        + ", maxColumn := "
        + Utils.toString(maxColumn)
        + ", matrix := "
        + Utils.toString(matrix)
        + "}";
  }
}
