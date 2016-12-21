package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Cell {
  private Number row = 0L;
  private Number column = 0L;
  private Number pieceId = 0L;

  public Boolean removePiece() {

    throw new UnsupportedOperationException();
  }

  public Boolean setPiece(final Number pos) {

    throw new UnsupportedOperationException();
  }

  public Number getPiece() {

    throw new UnsupportedOperationException();
  }

  public Cell() {}

  public String toString() {

    return "Cell{"
        + "row := "
        + Utils.toString(row)
        + ", column := "
        + Utils.toString(column)
        + ", pieceId := "
        + Utils.toString(pieceId)
        + "}";
  }
}
