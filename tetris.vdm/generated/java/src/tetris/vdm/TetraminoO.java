package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoO extends Tetramino {
  public void cg_init_TetraminoO_1(final Board board) {

    super.setColor(tetris.vdm.quotes.YellowQuote.getInstance());
    super.setId(4L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 5L));
    return;
  }

  public TetraminoO(final Board board) {

    cg_init_TetraminoO_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_17 = super.getOrientation();
    Number intPattern_47 = casesExp_17;
    Boolean success_17 = Utils.equals(intPattern_47, 0L);

    if (!(success_17)) {
      Number intPattern_48 = casesExp_17;
      success_17 = Utils.equals(intPattern_48, 1L);

      if (!(success_17)) {
        Number intPattern_49 = casesExp_17;
        success_17 = Utils.equals(intPattern_49, 2L);

        if (!(success_17)) {
          Number intPattern_50 = casesExp_17;
          success_17 = Utils.equals(intPattern_50, 3L);

          if (success_17) {
            Number intPattern_51 = index;
            Boolean success_18 = Utils.equals(intPattern_51, 1L);

            if (!(success_18)) {
              Number intPattern_52 = index;
              success_18 = Utils.equals(intPattern_52, 2L);

              if (success_18) {
                Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
              } else {
                Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
              }

            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_53 = index;
          Boolean success_19 = Utils.equals(intPattern_53, 1L);

          if (!(success_19)) {
            Number intPattern_54 = index;
            success_19 = Utils.equals(intPattern_54, 2L);

            if (success_19) {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            } else {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            }

          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_55 = index;
        Boolean success_20 = Utils.equals(intPattern_55, 1L);

        if (!(success_20)) {
          Number intPattern_56 = index;
          success_20 = Utils.equals(intPattern_56, 2L);

          if (success_20) {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_57 = index;
      Boolean success_21 = Utils.equals(intPattern_57, 1L);

      if (!(success_21)) {
        Number intPattern_58 = index;
        success_21 = Utils.equals(intPattern_58, 2L);

        if (success_21) {
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
    Number casesExp_22 = super.getOrientation();
    Number intPattern_59 = casesExp_22;
    Boolean success_22 = Utils.equals(intPattern_59, 0L);

    if (!(success_22)) {
      Number intPattern_60 = casesExp_22;
      success_22 = Utils.equals(intPattern_60, 1L);

      if (!(success_22)) {
        Number intPattern_61 = casesExp_22;
        success_22 = Utils.equals(intPattern_61, 2L);

        if (!(success_22)) {
          Number intPattern_62 = casesExp_22;
          success_22 = Utils.equals(intPattern_62, 3L);

          if (success_22) {
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
