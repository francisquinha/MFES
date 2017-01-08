package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoI extends Tetramino {
  public void cg_init_TetraminoI_1(final Game game) {

    super.setColor(tetris.vdm.quotes.CyanQuote.getInstance());
    super.setId(1L);
    super.initialSetMinoes(game, SeqUtil.seq(2L, 4L));
    return;
  }

  public TetraminoI(final Game game) {

    cg_init_TetraminoI_1(game);
  }

  protected VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_4 = super.getOrientation();
    Number intPattern_16 = casesExp_4;
    Boolean success_4 = Utils.equals(intPattern_16, 0L);

    if (!(success_4)) {
      Number intPattern_17 = casesExp_4;
      success_4 = Utils.equals(intPattern_17, 1L);

      if (!(success_4)) {
        Number intPattern_18 = casesExp_4;
        success_4 = Utils.equals(intPattern_18, 2L);

        if (!(success_4)) {
          Number intPattern_19 = casesExp_4;
          success_4 = Utils.equals(intPattern_19, 3L);

          if (success_4) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        }

      } else {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      }

    } else {
      Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
    }

    return Utils.copy(result);
  }

  protected VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_5 = super.getOrientation();
    Number intPattern_20 = casesExp_5;
    Boolean success_5 = Utils.equals(intPattern_20, 0L);

    if (!(success_5)) {
      Number intPattern_21 = casesExp_5;
      success_5 = Utils.equals(intPattern_21, 1L);

      if (!(success_5)) {
        Number intPattern_22 = casesExp_5;
        success_5 = Utils.equals(intPattern_22, 2L);

        if (!(success_5)) {
          Number intPattern_23 = casesExp_5;
          success_5 = Utils.equals(intPattern_23, 3L);

          if (success_5) {
            {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
            }
          }

        } else {
          {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
          }
        }

      } else {
        {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
        }
      }

    } else {
      {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
      }
    }

    return Utils.copy(result);
  }

  public TetraminoI() {}

  public String toString() {

    return "TetraminoI{}";
  }
}
