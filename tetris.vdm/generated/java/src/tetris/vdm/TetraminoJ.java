package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoJ extends Tetramino {
  public void cg_init_TetraminoJ_1(final Board board) {

    super.setColor(tetris.vdm.quotes.BlueQuote.getInstance());
    super.setId(2L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 4L));
    return;
  }

  public TetraminoJ(final Board board) {

    cg_init_TetraminoJ_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_5 = super.getOrientation();
    Number intPattern_23 = casesExp_5;
    Boolean success_5 = Utils.equals(intPattern_23, 0L);

    if (!(success_5)) {
      Number intPattern_24 = casesExp_5;
      success_5 = Utils.equals(intPattern_24, 1L);

      if (!(success_5)) {
        Number intPattern_25 = casesExp_5;
        success_5 = Utils.equals(intPattern_25, 2L);

        if (!(success_5)) {
          Number intPattern_26 = casesExp_5;
          success_5 = Utils.equals(intPattern_26, 3L);

          if (success_5) {
            Number intPattern_27 = index;
            Boolean success_6 = Utils.equals(intPattern_27, 1L);

            if (success_6) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_28 = index;
          Boolean success_7 = Utils.equals(intPattern_28, 1L);

          if (success_7) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_29 = index;
        Boolean success_8 = Utils.equals(intPattern_29, 1L);

        if (success_8) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_30 = index;
      Boolean success_9 = Utils.equals(intPattern_30, 1L);

      if (success_9) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_10 = super.getOrientation();
    Number intPattern_31 = casesExp_10;
    Boolean success_10 = Utils.equals(intPattern_31, 0L);

    if (!(success_10)) {
      Number intPattern_32 = casesExp_10;
      success_10 = Utils.equals(intPattern_32, 1L);

      if (!(success_10)) {
        Number intPattern_33 = casesExp_10;
        success_10 = Utils.equals(intPattern_33, 2L);

        if (!(success_10)) {
          Number intPattern_34 = casesExp_10;
          success_10 = Utils.equals(intPattern_34, 3L);

          if (success_10) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
          }

        } else {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
        }

      } else {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
      }

    } else {
      Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
    }

    return Utils.copy(result);
  }

  public TetraminoJ() {}

  public String toString() {

    return "TetraminoJ{}";
  }
}
