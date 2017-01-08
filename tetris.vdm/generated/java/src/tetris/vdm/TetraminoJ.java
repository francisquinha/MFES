package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoJ extends Tetramino {
  public void cg_init_TetraminoJ_1(final Game game) {

    super.setColor(tetris.vdm.quotes.BlueQuote.getInstance());
    super.setId(2L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 4L));
    return;
  }

  public TetraminoJ(final Game game) {

    cg_init_TetraminoJ_1(game);
  }

  protected VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_6 = super.getOrientation();
    Number intPattern_24 = casesExp_6;
    Boolean success_6 = Utils.equals(intPattern_24, 0L);

    if (!(success_6)) {
      Number intPattern_25 = casesExp_6;
      success_6 = Utils.equals(intPattern_25, 1L);

      if (!(success_6)) {
        Number intPattern_26 = casesExp_6;
        success_6 = Utils.equals(intPattern_26, 2L);

        if (!(success_6)) {
          Number intPattern_27 = casesExp_6;
          success_6 = Utils.equals(intPattern_27, 3L);

          if (success_6) {
            Number intPattern_28 = index;
            Boolean success_7 = Utils.equals(intPattern_28, 1L);

            if (success_7) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_29 = index;
          Boolean success_8 = Utils.equals(intPattern_29, 1L);

          if (success_8) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_30 = index;
        Boolean success_9 = Utils.equals(intPattern_30, 1L);

        if (success_9) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_31 = index;
      Boolean success_10 = Utils.equals(intPattern_31, 1L);

      if (success_10) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  protected VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_11 = super.getOrientation();
    Number intPattern_32 = casesExp_11;
    Boolean success_11 = Utils.equals(intPattern_32, 0L);

    if (!(success_11)) {
      Number intPattern_33 = casesExp_11;
      success_11 = Utils.equals(intPattern_33, 1L);

      if (!(success_11)) {
        Number intPattern_34 = casesExp_11;
        success_11 = Utils.equals(intPattern_34, 2L);

        if (!(success_11)) {
          Number intPattern_35 = casesExp_11;
          success_11 = Utils.equals(intPattern_35, 3L);

          if (success_11) {
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
