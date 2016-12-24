package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private Number rows = 0L;
  private Number columns = 0L;
  private String startTag = "<!";
  private String endTag = "!>\n";
  private String bottomLine = "=============";

  public void initBoard() {

    IO.print("# call 'Board:initBoard'\n\n");
    long toVar_1 = 12L;

    for (Long x = 1L; x <= toVar_1; x++) {
      IO.print(startTag + "□□□□□□□□□□□□□" + endTag);
    }
    IO.print(startTag + bottomLine + endTag);
  }

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
        + ", startTag := "
        + Utils.toString(startTag)
        + ", endTag := "
        + Utils.toString(endTag)
        + ", bottomLine := "
        + Utils.toString(bottomLine)
        + "}";
  }
}
