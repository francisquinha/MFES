package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Cell {
  private Number totalRows = 11L;
  private Number totalColumns = 11L;
  private Number emptyCell = 0L;
  private Number forMoveCell = 1L;
  private Number filledCell = 2L;
  private Number tempCell = 9L;
  private VDMMap matrix = MapUtil.map();
  private VDMMap tempMatrix = MapUtil.map();
  private Number pieceOperation = 0L;

  public VDMMap setPiece(
      final String option,
      final VDMSeq coord1,
      final VDMSeq coord2,
      final VDMSeq coord3,
      final VDMSeq coord4,
      final VDMMap get_matrix) {

    matrix = Utils.copy(get_matrix);
    {
      if (Utils.equals(option, "set")) {
        pieceOperation = forMoveCell;
      } else if (Utils.equals(option, "remove")) {
        pieceOperation = emptyCell;
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
    return Utils.copy(matrix);
  }

  public VDMMap automaticallyMovePiece(final VDMMap get_tempMatrix, final VDMMap get_matrix) {

    matrix = Utils.copy(get_matrix);
    tempMatrix = Utils.copy(get_tempMatrix);
    long toVar_8 = totalRows.longValue();

    for (Long i = 0L; i <= toVar_8; i++) {
      long toVar_7 = totalColumns.longValue();

      for (Long j = 0L; j <= toVar_7; j++) {
        if (Utils.equals(((Number) Utils.get(matrix, SeqUtil.seq(i, j))), forMoveCell)) {
          Utils.mapSeqUpdate(tempMatrix, SeqUtil.seq(i.longValue() + 1L, j), forMoveCell);
        }
      }
    }
    matrix = Utils.copy(tempMatrix);
    return Utils.copy(tempMatrix);
  }

  public Cell() {}

  public String toString() {

    return "Cell{"
        + "totalRows := "
        + Utils.toString(totalRows)
        + ", totalColumns := "
        + Utils.toString(totalColumns)
        + ", emptyCell := "
        + Utils.toString(emptyCell)
        + ", forMoveCell := "
        + Utils.toString(forMoveCell)
        + ", filledCell := "
        + Utils.toString(filledCell)
        + ", tempCell := "
        + Utils.toString(tempCell)
        + ", matrix := "
        + Utils.toString(matrix)
        + ", tempMatrix := "
        + Utils.toString(tempMatrix)
        + ", pieceOperation := "
        + Utils.toString(pieceOperation)
        + "}";
  }
}
