package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tetramino {
  private String color = "";
  private String orientation = "";
  private String mino0 = "";
  private String mino1 = "";
  private String mino2 = "";
  private String mino3 = "";

  public Boolean moveDown() {

    throw new UnsupportedOperationException();
  }

  public Boolean moveLeft() {

    throw new UnsupportedOperationException();
  }

  public Boolean moveRight() {

    throw new UnsupportedOperationException();
  }

  public Boolean rotate() {

    throw new UnsupportedOperationException();
  }

  public Tetramino() {}

  public String toString() {

    return "Tetramino{"
        + "color := "
        + Utils.toString(color)
        + ", orientation := "
        + Utils.toString(orientation)
        + ", mino0 := "
        + Utils.toString(mino0)
        + ", mino1 := "
        + Utils.toString(mino1)
        + ", mino2 := "
        + Utils.toString(mino2)
        + ", mino3 := "
        + Utils.toString(mino3)
        + "}";
  }
}
