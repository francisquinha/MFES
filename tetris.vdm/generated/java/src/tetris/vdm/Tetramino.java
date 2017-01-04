package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
abstract public class Tetramino {
  private Object color = tetris.vdm.quotes.CyanQuote.getInstance();
  private Number id = 0L;
  private Number orientation = 0L;
  private VDMSeq minoes =
      SeqUtil.seq(
          SeqUtil.seq(1L, 1L), SeqUtil.seq(1L, 2L), SeqUtil.seq(1L, 3L), SeqUtil.seq(1L, 4L));

  public void setColor(final Object c) {

    color = c;
  }

  public void setId(final Number i) {

    id = i;
  }

  public Number getOrientation() {

    return orientation;
  }

  public Boolean setMinoes(final Board board, final VDMSeq position) {

    VDMSeq tempMinoes = Utils.copy(minoes);
    VDMSeq tempPosition = Utils.copy(position);
    removeTetramino(board);
    long toVar_23 = 4L;

    for (Long i = 1L; i <= toVar_23; i++) {
      if (validPosition(board, Utils.copy(tempPosition))) {
        Utils.mapSeqUpdate(tempMinoes, i, Utils.copy(tempPosition));
      } else {
        addTetramino(board);
        return false;
      }

      tempPosition = getNextMino(Utils.copy(tempPosition), i);
    }
    minoes = Utils.copy(tempMinoes);
    addTetramino(board);
    return true;
  }

  public void initialSetMinoes(final Board board, final VDMSeq position) {

    VDMSeq tempPosition = Utils.copy(position);
    long toVar_24 = 4L;

    for (Long i = 1L; i <= toVar_24; i++) {
      if (validPosition(board, Utils.copy(tempPosition))) {
        Utils.mapSeqUpdate(minoes, i, Utils.copy(tempPosition));
        tempPosition = getNextMino(Utils.copy(tempPosition), i);

      } else {
        board.setGameOver();
      }
    }
    if (!(board.getGameOver())) {
      addTetramino(board);
    }
  }

  public abstract VDMSeq getNextMino(final VDMSeq position, final Number index);

  public abstract VDMSeq getRotatedMino(final VDMSeq position);

  public Boolean validPosition(final Board board, final VDMSeq position) {

    if (((Number) Utils.get(position, 1L)).longValue() < 1L) {
      return false;

    } else {
      if (((Number) Utils.get(position, 1L)).longValue() > board.getMaxRow().longValue()) {
        return false;

      } else {
        if (((Number) Utils.get(position, 2L)).longValue() < 1L) {
          return false;

        } else {
          if (((Number) Utils.get(position, 2L)).longValue() > board.getMaxColumn().longValue()) {
            return false;

          } else {
            if (!(Utils.equals(board.getMatrixPosition(Utils.copy(position)), 0L))) {
              return false;

            } else {
              return true;
            }
          }
        }
      }
    }
  }

  public void removeTetramino(final Board board) {

    for (Iterator iterator_1 = minoes.iterator(); iterator_1.hasNext(); ) {
      VDMSeq mino = (VDMSeq) iterator_1.next();
      board.setMatrixPosition(Utils.copy(mino), 0L);
    }
  }

  public void addTetramino(final Board board) {

    for (Iterator iterator_2 = minoes.iterator(); iterator_2.hasNext(); ) {
      VDMSeq mino = (VDMSeq) iterator_2.next();
      board.setMatrixPosition(Utils.copy(mino), id);
    }
  }

  public Boolean moveDown(final Board board) {

    return setMinoes(
        board,
        SeqUtil.seq(
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 1L)).longValue() + 1L,
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 2L))));
  }

  public Boolean moveLeft(final Board board) {

    return setMinoes(
        board,
        SeqUtil.seq(
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 1L)),
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 2L)).longValue() - 1L));
  }

  public Boolean moveRight(final Board board) {

    return setMinoes(
        board,
        SeqUtil.seq(
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 1L)),
            ((Number) Utils.get(((VDMSeq) Utils.get(minoes, 1L)), 2L)).longValue() + 1L));
  }

  public Boolean rotate(final Board board) {

    VDMSeq position = getRotatedMino(Utils.copy(((VDMSeq) Utils.get(minoes, 1L))));
    orientation = Utils.mod(orientation.longValue() + 1L, 4L);
    return setMinoes(board, Utils.copy(position));
  }

  public Number drop(final Board board) {

    Number result = 0L;
    Boolean whileCond_3 = true;
    while (whileCond_3) {
      whileCond_3 = moveDown(board);
      if (!(whileCond_3)) {
        break;
      }

      result = result.longValue() + 1L;
    }

    return result;
  }

  public Tetramino() {}

  public String toString() {

    return "Tetramino{"
        + "color := "
        + Utils.toString(color)
        + ", id := "
        + Utils.toString(id)
        + ", orientation := "
        + Utils.toString(orientation)
        + ", minoes := "
        + Utils.toString(minoes)
        + "}";
  }
}
