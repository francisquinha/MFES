package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoO extends Tetramino {
  public void cg_init_TetraminoO_1(final Game game) {

    super.setColor(tetris.vdm.quotes.YellowQuote.getInstance());
    super.setId(4L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 5L));
    return;
  }

  public TetraminoO(final Game game) {

    cg_init_TetraminoO_1(game);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_18 = super.getOrientation();
    Number intPattern_48 = casesExp_18;
    Boolean success_18 = Utils.equals(intPattern_48, 0L);

    if (!(success_18)) {
      Number intPattern_49 = casesExp_18;
      success_18 = Utils.equals(intPattern_49, 1L);

      if (!(success_18)) {
        Number intPattern_50 = casesExp_18;
        success_18 = Utils.equals(intPattern_50, 2L);

        if (!(success_18)) {
          Number intPattern_51 = casesExp_18;
          success_18 = Utils.equals(intPattern_51, 3L);

          if (success_18) {
            Number intPattern_52 = index;
            Boolean success_19 = Utils.equals(intPattern_52, 1L);

            if (!(success_19)) {
              Number intPattern_53 = index;
              success_19 = Utils.equals(intPattern_53, 2L);

              if (success_19) {
                Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
              } else {
                Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
              }

            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_54 = index;
          Boolean success_20 = Utils.equals(intPattern_54, 1L);

          if (!(success_20)) {
            Number intPattern_55 = index;
            success_20 = Utils.equals(intPattern_55, 2L);

            if (success_20) {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            } else {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            }

          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_56 = index;
        Boolean success_21 = Utils.equals(intPattern_56, 1L);

        if (!(success_21)) {
          Number intPattern_57 = index;
          success_21 = Utils.equals(intPattern_57, 2L);

          if (success_21) {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_58 = index;
      Boolean success_22 = Utils.equals(intPattern_58, 1L);

      if (!(success_22)) {
        Number intPattern_59 = index;
        success_22 = Utils.equals(intPattern_59, 2L);

        if (success_22) {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        } else {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        }

      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_23 = super.getOrientation();
    Number intPattern_60 = casesExp_23;
    Boolean success_23 = Utils.equals(intPattern_60, 0L);

    if (!(success_23)) {
      Number intPattern_61 = casesExp_23;
      success_23 = Utils.equals(intPattern_61, 1L);

      if (!(success_23)) {
        Number intPattern_62 = casesExp_23;
        success_23 = Utils.equals(intPattern_62, 2L);

        if (!(success_23)) {
          Number intPattern_63 = casesExp_23;
          success_23 = Utils.equals(intPattern_63, 3L);

          if (success_23) {
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

  public TetraminoO() {}

  public String toString() {

    return "TetraminoO{}";
  }
}
