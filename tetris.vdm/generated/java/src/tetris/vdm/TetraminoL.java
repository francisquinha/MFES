package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoL extends Tetramino {
  public void cg_init_TetraminoL_1(final Game game) {

    super.setColor(tetris.vdm.quotes.OrangeQuote.getInstance());
    super.setId(3L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 6L));
    return;
  }

  public TetraminoL(final Game game) {

    cg_init_TetraminoL_1(game);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_12 = super.getOrientation();
    Number intPattern_36 = casesExp_12;
    Boolean success_12 = Utils.equals(intPattern_36, 0L);

    if (!(success_12)) {
      Number intPattern_37 = casesExp_12;
      success_12 = Utils.equals(intPattern_37, 1L);

      if (!(success_12)) {
        Number intPattern_38 = casesExp_12;
        success_12 = Utils.equals(intPattern_38, 2L);

        if (!(success_12)) {
          Number intPattern_39 = casesExp_12;
          success_12 = Utils.equals(intPattern_39, 3L);

          if (success_12) {
            Number intPattern_40 = index;
            Boolean success_13 = Utils.equals(intPattern_40, 1L);

            if (success_13) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            }
          }

        } else {
          Number intPattern_41 = index;
          Boolean success_14 = Utils.equals(intPattern_41, 1L);

          if (success_14) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
          }
        }

      } else {
        Number intPattern_42 = index;
        Boolean success_15 = Utils.equals(intPattern_42, 1L);

        if (success_15) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        }
      }

    } else {
      Number intPattern_43 = index;
      Boolean success_16 = Utils.equals(intPattern_43, 1L);

      if (success_16) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_17 = super.getOrientation();
    Number intPattern_44 = casesExp_17;
    Boolean success_17 = Utils.equals(intPattern_44, 0L);

    if (!(success_17)) {
      Number intPattern_45 = casesExp_17;
      success_17 = Utils.equals(intPattern_45, 1L);

      if (!(success_17)) {
        Number intPattern_46 = casesExp_17;
        success_17 = Utils.equals(intPattern_46, 2L);

        if (!(success_17)) {
          Number intPattern_47 = casesExp_17;
          success_17 = Utils.equals(intPattern_47, 3L);

          if (success_17) {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
        }

      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
      }

    } else {
      Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
    }

    return Utils.copy(result);
  }

  public TetraminoL() {}

  public String toString() {

    return "TetraminoL{}";
  }
}
