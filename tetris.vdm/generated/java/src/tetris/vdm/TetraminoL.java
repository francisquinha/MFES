package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoL extends Tetramino {
  public void cg_init_TetraminoL_1(final Board board) {

    super.setColor(tetris.vdm.quotes.OrangeQuote.getInstance());
    super.setId(3L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 6L));
    return;
  }

  public TetraminoL(final Board board) {

    cg_init_TetraminoL_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_11 = super.getOrientation();
    Number intPattern_35 = casesExp_11;
    Boolean success_11 = Utils.equals(intPattern_35, 0L);

    if (!(success_11)) {
      Number intPattern_36 = casesExp_11;
      success_11 = Utils.equals(intPattern_36, 1L);

      if (!(success_11)) {
        Number intPattern_37 = casesExp_11;
        success_11 = Utils.equals(intPattern_37, 2L);

        if (!(success_11)) {
          Number intPattern_38 = casesExp_11;
          success_11 = Utils.equals(intPattern_38, 3L);

          if (success_11) {
            Number intPattern_39 = index;
            Boolean success_12 = Utils.equals(intPattern_39, 1L);

            if (success_12) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            }
          }

        } else {
          Number intPattern_40 = index;
          Boolean success_13 = Utils.equals(intPattern_40, 1L);

          if (success_13) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
          }
        }

      } else {
        Number intPattern_41 = index;
        Boolean success_14 = Utils.equals(intPattern_41, 1L);

        if (success_14) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        }
      }

    } else {
      Number intPattern_42 = index;
      Boolean success_15 = Utils.equals(intPattern_42, 1L);

      if (success_15) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_16 = super.getOrientation();
    Number intPattern_43 = casesExp_16;
    Boolean success_16 = Utils.equals(intPattern_43, 0L);

    if (!(success_16)) {
      Number intPattern_44 = casesExp_16;
      success_16 = Utils.equals(intPattern_44, 1L);

      if (!(success_16)) {
        Number intPattern_45 = casesExp_16;
        success_16 = Utils.equals(intPattern_45, 2L);

        if (!(success_16)) {
          Number intPattern_46 = casesExp_16;
          success_16 = Utils.equals(intPattern_46, 3L);

          if (success_16) {
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
