package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
abstract public class Tetramino {
  private Object color = tetris.vdm.quotes.CyanQuote.getInstance();
  private Number id = 1L;
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
    long toVar_11 = 4L;

    for (Long i = 1L; i <= toVar_11; i++) {
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

  public void initialSetMinoes(final Game game, final VDMSeq position) {

    VDMSeq tempPosition = Utils.copy(position);
    VDMSeq tempMinoes = Utils.copy(minoes);
    long toVar_12 = 4L;

    for (Long i = 1L; i <= toVar_12; i++) {
      if (validPosition(game.getBoard(), Utils.copy(tempPosition))) {
        Utils.mapSeqUpdate(tempMinoes, i, Utils.copy(tempPosition));
        tempPosition = getNextMino(Utils.copy(tempPosition), i);

      } else {
        game.setGameOver();
      }
    }
    if (!(game.getGameOver())) {
      minoes = Utils.copy(tempMinoes);
      addTetramino(game.getBoard());
    }
  }

  public abstract VDMSeq getNextMino(final VDMSeq position, final Number index);

  public abstract VDMSeq getRotatedMino(final VDMSeq position);

  public Boolean validPosition(final Board board, final VDMSeq position) {

    Boolean andResult_5 = false;

    if (checkPosition(Utils.copy(position), 1L, Board.maxRow, 1L, Board.maxColumn)) {
      if (Utils.equals(board.getMatrixPosition(Utils.copy(position)), 0L)) {
        andResult_5 = true;
      }
    }

    return andResult_5;
  }

  public void removeTetramino(final Board board) {

    for (Iterator iterator_2 = minoes.iterator(); iterator_2.hasNext(); ) {
      VDMSeq mino = (VDMSeq) iterator_2.next();
      board.setMatrixPosition(Utils.copy(mino), 0L);
    }
  }

  public void addTetramino(final Board board) {

    for (Iterator iterator_3 = minoes.iterator(); iterator_3.hasNext(); ) {
      VDMSeq mino = (VDMSeq) iterator_3.next();
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

  public static Boolean checkPosition(
      final VDMSeq position,
      final Number min1,
      final Number max1,
      final Number min2,
      final Number max2) {

    Boolean andResult_7 = false;

    if (((Number) Utils.get(position, 1L)).longValue() >= min1.longValue()) {
      Boolean andResult_8 = false;

      if (((Number) Utils.get(position, 1L)).longValue() <= max1.longValue()) {
        Boolean andResult_9 = false;

        if (((Number) Utils.get(position, 2L)).longValue() >= min2.longValue()) {
          if (((Number) Utils.get(position, 2L)).longValue() <= max2.longValue()) {
            andResult_9 = true;
          }
        }

        if (andResult_9) {
          andResult_8 = true;
        }
      }

      if (andResult_8) {
        andResult_7 = true;
      }
    }

    return andResult_7;
  }

  public static Boolean checkMinoes(
      final VDMSeq minoes_1,
      final Number min1,
      final Number max1,
      final Number min2,
      final Number max2) {

    Boolean andResult_10 = false;

    if (Utils.equals(SeqUtil.elems(Utils.copy(minoes_1)).size(), 4L)) {
      Boolean forAllExpResult_1 = true;
      VDMSet set_1 = SeqUtil.elems(Utils.copy(minoes_1));
      for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext() && forAllExpResult_1; ) {
        VDMSeq mino = ((VDMSeq) iterator_1.next());
        forAllExpResult_1 = checkPosition(Utils.copy(mino), min1, max1, min2, max2);
      }
      if (forAllExpResult_1) {
        andResult_10 = true;
      }
    }

    return andResult_10;
  }

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
