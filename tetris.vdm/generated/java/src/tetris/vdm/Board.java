package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private Number rows = 0L;
  private Number columns = 0L;

  public Boolean checkRow(final Number row) {

    throw new UnsupportedOperationException();
  }

  public Board() {}

  public String toString() {

    return "Board{"
        + "rows := "
        + Utils.toString(rows)
        + ", columns := "
        + Utils.toString(columns)
        + "}";
  }
}
